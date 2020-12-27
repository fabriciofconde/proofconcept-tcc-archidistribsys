package br.com.ffc.puc.tcc.devapi.service.impl.v1;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.istack.NotNull;

import br.com.ffc.puc.tcc.devapi.client.GithubApiClient;
import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.client.dto.UserGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.exception.ResourceAlreadyExistsException;
import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.repository.DeveloperRepository;
import br.com.ffc.puc.tcc.devapi.repository.RepositoryRepository;
import br.com.ffc.puc.tcc.devapi.service.DeveloperService;
import br.com.ffc.puc.tcc.devapi.service.RepositoryService;
import br.com.ffc.puc.tcc.devapi.util.MessageSourceUtil;
import br.com.ffc.puc.tcc.devapi.util.ObjectMapperUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author fabricio
 *
 */
@Slf4j
@Service(DeveloperServiceImpl.QUALIFIER)
@Transactional
public class DeveloperServiceImpl implements DeveloperService.V1 {

	public static final String QUALIFIER = "DeveloperServiceV1";
	
	@Autowired
	private GithubApiClient githubApiClient;
	
	@Autowired
	private DeveloperRepository developerRepository;

	@Autowired
	private RepositoryRepository repositoryRepository;
	
	@Autowired
	private RepositoryService.V1 repositoryService;

	@Autowired
	private MessageSourceUtil messageSourceUtil;
	
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	@Override
	public DeveloperResponseDTO save(@NotNull String username) {
		if (developerRepository.existsByUsername(username)) {
			throw new ResourceAlreadyExistsException(
				messageSourceUtil.getMessage("developer.error.alreadyExists", username)
			);
		}

		UserGithubApiDTO user = githubApiClient.getUserByLogin(username);
		log.debug("Return of user from githubapi login {0}={1}", username, user);
		
		Developer developer = developerRepository.save(convertGithubDtoToObject(user));

		List<RepoGithubApiDTO> reposDto = githubApiClient.getReposByLogin(username);	
		reposDto
			.stream()
			.map(repositoryService::convertGithubDtoToObject)
			.forEach(repository -> {
				repository.setDeveloper(developer);
				repositoryRepository.save(repository);
			});

		log.info("New developer \"{0}\" was created", username);

        return ObjectMapperUtil.map(developer, DeveloperResponseDTO.class);
    }
	
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	@Override
    public Optional<DeveloperResponseDTO> findByUsername(String username) {
		Optional<Developer> developer = developerRepository.findByUsername(username);
        return ObjectMapperUtil.mapOptional(developer, new TypeToken<Optional<DeveloperResponseDTO>>() {}.getType());
    }

    /**
     * 
     * @return
     */
	@Override
    public Iterable<DeveloperResponseDTO> findAll() {
		Iterable<Developer> developers = developerRepository.findAll();
        return ObjectMapperUtil.mapAll(developers, DeveloperResponseDTO.class);
    }

    /**
     * 
     * @param id
     */
	@Override
    public void delete(Integer id) {
    	log.info(String.format("Delete developer with id=%s", id));
    	developerRepository.deleteById(id);
    }

	/**
     * @param userGithubApiDTO
     * @return
     */
	@Override
	public Developer convertGithubDtoToObject(UserGithubApiDTO userGithubApiDTO) {
		return ObjectMapperUtil.map(userGithubApiDTO, Developer.class);
	}
	
}
