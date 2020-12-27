package br.com.ffc.puc.tcc.devapi.service.impl.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.istack.NotNull;

import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Repository;
import br.com.ffc.puc.tcc.devapi.repository.RepositoryRepository;
import br.com.ffc.puc.tcc.devapi.service.RepositoryService;
import br.com.ffc.puc.tcc.devapi.util.ObjectMapperUtil;

/**
 *
 */
@Service(RepositoryServiceImpl.QUALIFIER)
public class RepositoryServiceImpl implements RepositoryService.V1 {

    public static final String QUALIFIER = "RepositoryServiceV1";

    @Autowired
    private RepositoryRepository repositoryRepository;


    /**
     *
     * @param username
     * @return
     */
    @Override
    public Iterable<RepositoryResponseDTO> findAllByUsername(@NotNull String username) {
        Iterable<Repository> repositories = repositoryRepository.findAllByUsernameDeveloper(username);
        return ObjectMapperUtil.mapAll(repositories, RepositoryResponseDTO.class);
    }


    /**
     * @param repoGithubApiDTO
     * @return
     */
	@Override
	public Repository convertGithubDtoToObject(RepoGithubApiDTO repoGithubApiDTO) {
		return ObjectMapperUtil.map(repoGithubApiDTO, Repository.class);
	}

}
