package br.com.ffc.puc.tcc.devapi.service.v1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.model.Repository;
import br.com.ffc.puc.tcc.devapi.repository.DeveloperRepository;
import br.com.ffc.puc.tcc.devapi.repository.RepositoryRepository;
import br.com.ffc.puc.tcc.devapi.service.BaseServiceTest;
import br.com.ffc.puc.tcc.devapi.service.impl.v1.RepositoryServiceImpl;
import br.com.ffc.puc.tcc.devapi.util.MessageSourceUtil;

/**
 * 
 * @author fabricio
 *
 */
@ExtendWith(MockitoExtension.class)
public class RepositoryServiceTest extends BaseServiceTest {

    @InjectMocks
    private RepositoryServiceImpl repositoryService;

    @Mock
    private RepositoryRepository repositoryRepository;

    @Mock
    private DeveloperRepository developerRepository;

    @Mock
    private MessageSourceUtil messageSourceUtil;


    @Test
    public void testFindAllByUsernameShouldReturnRepositories() {
        Developer developer = getSampleDeveloper();
        List<Repository> sampleData = getSampleRepositories();

        when(repositoryRepository.findAllByUsernameDeveloper(any(String.class))).thenReturn(sampleData);

        Iterable<RepositoryResponseDTO> repositoriesDTO = repositoryService.findAllByUsername(developer.getUsername());

        assertThat(repositoriesDTO.iterator().hasNext()).isTrue();
    }

    @Test
    public void testFindAllByUsernameShouldReturnEmpty() {
        Developer developer = getSampleDeveloper();

        when(repositoryRepository.findAllByUsernameDeveloper(any(String.class))).thenReturn(Collections.emptyList());

        Iterable<RepositoryResponseDTO> repositoriesDTO = repositoryService.findAllByUsername(developer.getUsername());

        assertThat(repositoriesDTO.iterator().hasNext()).isFalse();
    }

    @Test
    public void testShouldConverterDtoToObject() {
        RepoGithubApiDTO sampleData = getSampleRepoGithubApiDTO();
        Repository repository = repositoryService.convertGithubDtoToObject(sampleData);

        assertThat(sampleData.getName()).isEqualTo(repository.getName());
        assertThat(sampleData.getFork()).isEqualTo(repository.getFork());
        assertThat(sampleData.getUpdatedAt()).isEqualTo(repository.getUpdatedAt());
        assertThat(sampleData.getWatchers()).isEqualTo(repository.getWatchers());
    }

}
