package br.com.ffc.puc.tcc.devapi.service.v1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.ffc.puc.tcc.devapi.client.GithubApiClient;
import br.com.ffc.puc.tcc.devapi.client.dto.UserGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.exception.ResourceAlreadyExistsException;
import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.repository.DeveloperRepository;
import br.com.ffc.puc.tcc.devapi.service.BaseServiceTest;
import br.com.ffc.puc.tcc.devapi.service.RepositoryService;
import br.com.ffc.puc.tcc.devapi.service.impl.v1.DeveloperServiceImpl;
import br.com.ffc.puc.tcc.devapi.util.MessageSourceUtil;
import feign.FeignException;
import feign.Request;

/**
 * 
 * @author fabricio
 *
 */
@ExtendWith(MockitoExtension.class)
public class DeveloperServiceTest extends BaseServiceTest {

    @InjectMocks
    private DeveloperServiceImpl developerService;

    @Mock
    private GithubApiClient githubApiClient;

    @Mock
    private DeveloperRepository developerRepository;

    @Mock
    private RepositoryService.V1 repositoryService;

    @Mock
    private MessageSourceUtil messageSourceUtil;


    @Test
    public void testSaveShouldSaveAndReturnDeveloper() {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        when(developerRepository.existsByUsername(any(String.class))).thenReturn(false);
        when(githubApiClient.getUserByLogin(any(String.class))).thenReturn(new UserGithubApiDTO());
        //when(repositoryService.convertGithubDtoToObject(any(RepoGithubApiDTO.class))).thenReturn(sampleRepository);
        when(developerRepository.save(any(Developer.class))).thenAnswer(invocation -> invocation.getArgument(0));

        DeveloperResponseDTO savedDeveloper = developerService.save(sampleData.getUsername());

        assertThat(savedDeveloper).isNotNull();

        verify(developerRepository).save(any(Developer.class));
    }

    @Test
    public void testSaveShouldThrowResourceAlreadyExistsException() {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        when(developerRepository.existsByUsername(any(String.class))).thenReturn(true);
        when(messageSourceUtil.getMessage(any(String.class), any(String.class))).thenReturn("");

        try {
            developerService.save(sampleData.getUsername());
        } catch (Exception e) {
            assertThat(e).isInstanceOf(ResourceAlreadyExistsException.class);
        }
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testSaveShouldThrowResourceNotFoundException() {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        when(developerRepository.existsByUsername(any(String.class))).thenReturn(false);
        when(githubApiClient.getUserByLogin(any(String.class))).thenThrow(new FeignException.NotFound(
                null, Request.create(Request.HttpMethod.GET, "", Collections.emptyMap(), new byte[0], Charset.defaultCharset()), null));

        try {
            developerService.save(sampleData.getUsername());
        } catch (Exception e) {
            assertThat(e).isInstanceOf(FeignException.NotFound.class);
        }
    }

    @Test
    public void testFindByUsernameShouldReturnDeveloper() {
        Developer sampleData = getSampleDeveloper();

        when(developerRepository.findByUsername(any(String.class))).thenReturn(Optional.of(sampleData));

        Optional<DeveloperResponseDTO> developerResponseDTO = developerService.findByUsername(sampleData.getUsername());

        assertThat(developerResponseDTO.isPresent()).isTrue();
        assertThat(developerResponseDTO.get().getId()).isEqualTo(sampleData.getId());
        assertThat(developerResponseDTO.get().getUsername()).isEqualTo(sampleData.getUsername());
        assertThat(developerResponseDTO.get().getName()).isEqualTo(sampleData.getName());
    }


    @Test
    public void testFindByUsernameShouldReturnNull() {
        Developer sampleData = getSampleDeveloper();

        when(developerRepository.findByUsername(any(String.class))).thenReturn(Optional.empty());

        Optional<DeveloperResponseDTO> developerResponseDTO = developerService.findByUsername(sampleData.getUsername());

        assertThat(developerResponseDTO.isPresent()).isFalse();
    }

    @Test
    public void testFindAllShouldReturnDevelopers() {
        List<Developer> sampleData = getSampleDevelopers();

        when(developerRepository.findAll()).thenReturn(sampleData);

        Iterable<DeveloperResponseDTO> developersResponseDTO = developerService.findAll();

        assertThat(developersResponseDTO.iterator().hasNext()).isTrue();
    }

    @Test
    public void testFindAllShouldReturnEmpty() {
        when(developerRepository.findAll()).thenReturn(Collections.emptyList());

        Iterable<DeveloperResponseDTO> developersResponseDTO = developerService.findAll();

        assertThat(developersResponseDTO.iterator().hasNext()).isFalse();
    }

    @Test
    public void testDeleteShouldRemoveDeveloper() {
        Developer sampleData = getSampleDeveloper();

        doNothing().when(developerRepository).deleteById(any(Integer.class));

        developerService.delete(sampleData.getId());

        assertThat(true).isTrue();
    }

    @Test
    public void testDeleteShouldThrowException() {
        Developer sampleData = getSampleDeveloper();

        doThrow(new EntityNotFoundException()).when(developerRepository).deleteById(any(Integer.class));

        try {
            developerService.delete(sampleData.getId());
        } catch (Exception e) {
            assertThat(e).isInstanceOf(EntityNotFoundException.class);
        }
    }

    @Test
    public void testShouldConverterDtoToObject() {
        UserGithubApiDTO sampleData = getSampleUserGithubApiDTO();
        Developer developer = developerService.convertGithubDtoToObject(sampleData);

        assertThat(sampleData.getUsername()).isEqualTo(developer.getUsername());
        assertThat(sampleData.getName()).isEqualTo(developer.getName());
    }

}
