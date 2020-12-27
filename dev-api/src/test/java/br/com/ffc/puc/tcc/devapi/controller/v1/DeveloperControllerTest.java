package br.com.ffc.puc.tcc.devapi.controller.v1;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import br.com.ffc.puc.tcc.devapi.controller.BaseControllerTest;
import br.com.ffc.puc.tcc.devapi.controller.v1.DeveloperController;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.exception.ResourceAlreadyExistsException;
import br.com.ffc.puc.tcc.devapi.exception.ResourceNotFoundException;
import br.com.ffc.puc.tcc.devapi.service.DeveloperService;
import br.com.ffc.puc.tcc.devapi.service.RepositoryService;

/**
 * 
 * @author fabricio
 *
 */
@WebMvcTest(value = DeveloperController.class, excludeAutoConfiguration = { SecurityAutoConfiguration.class })
public class DeveloperControllerTest extends BaseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DeveloperService.V1 developerService;

    @MockBean
    private RepositoryService.V1 repositoryService;


    @Test
    public void testSaveShouldReturnDeveloper() throws Exception {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        when(developerService.save(any(String.class))).thenReturn(sampleData);

        mockMvc
                .perform(
                        post("/v1/developer/{username}", sampleData.getUsername())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.username", equalTo(sampleData.getUsername())))
                .andExpect(jsonPath("$.name", equalTo(sampleData.getName())));
    }

    @Test
    public void testSaveShouldReturnNotFound() throws Exception {
        String username = "fabriciofconde";

        when(developerService.save(any(String.class))).thenThrow(new ResourceNotFoundException());

        mockMvc
                .perform(
                        post("/v1/developer/{username}", username)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.status", equalTo(HttpStatus.NOT_FOUND.value())));
    }

    @Test
    public void testSaveShouldReturnAlreadyExists() throws Exception {
        String username = "fabriciofconde";

        when(developerService.save(any(String.class))).thenThrow(new ResourceAlreadyExistsException());

        mockMvc
                .perform(
                        post("/v1/developer/{username}", username)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isConflict())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.status", equalTo(HttpStatus.CONFLICT.value())));
    }

    @Test
    public void testGetByUsernameShouldReturnDeveloper() throws Exception {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        when(developerService.findByUsername(any(String.class))).thenReturn(Optional.of(sampleData));

        mockMvc
                .perform(
                        get("/v1/developer/{username}", sampleData.getUsername())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.username", equalTo(sampleData.getUsername())))
                .andExpect(jsonPath("$.name", equalTo(sampleData.getName())));
    }

    @Test
    public void testGetByUsernameShouldReturnNotFound() throws Exception {
        String username = "fabriciofconde";

        when(developerService.findByUsername(any(String.class))).thenReturn(Optional.empty());

        mockMvc
                .perform(
                        get("/v1/developer/{username}", username)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    public void testListRepositoriesByUsernameShouldReturnRepositories() throws Exception {
        String username = "fabriciofconde";
        List<RepositoryResponseDTO> sampleRepositories = getSampleRepositoriesV1();

        when(repositoryService.findAllByUsername(any(String.class))).thenReturn(sampleRepositories);

        mockMvc
                .perform(
                        get("/v1/developer/{username}/repositories", username)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", not(empty())))
                .andExpect(jsonPath("$.[0].name", equalTo(sampleRepositories.get(0).getName())))
                .andExpect(jsonPath("$.[0].fork", equalTo(sampleRepositories.get(0).getFork())))
                .andExpect(jsonPath("$.[0].size", equalTo(sampleRepositories.get(0).getSize())))
                .andExpect(jsonPath("$.[1].name", equalTo(sampleRepositories.get(1).getName())))
                .andExpect(jsonPath("$.[1].fork", equalTo(sampleRepositories.get(1).getFork())))
                .andExpect(jsonPath("$.[1].size", equalTo(sampleRepositories.get(1).getSize())))
                .andExpect(jsonPath("$.[2].name", equalTo(sampleRepositories.get(2).getName())))
                .andExpect(jsonPath("$.[2].fork", equalTo(sampleRepositories.get(2).getFork())))
                .andExpect(jsonPath("$.[2].size", equalTo(sampleRepositories.get(2).getSize())));
    }

    @Test
    public void testListRepositoriesByUsernameShouldReturnEmpty() throws Exception {
        String username = "fabriciofconde";

        when(repositoryService.findAllByUsername(any(String.class))).thenReturn(Collections.emptyList());

        mockMvc
                .perform(
                        get("/v1/developer/{username}/repositories", username)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", empty()));
    }

    @Test
    public void testListAllDevelopersShouldReturnDevelopers() throws Exception {
        List<DeveloperResponseDTO> sampleDevelopers = getSampleDevelopersV1();

        when(developerService.findAll()).thenReturn(sampleDevelopers);

        mockMvc
                .perform(
                        get("/v1/developer")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", not(empty())))
                .andExpect(jsonPath("$.[0].name", equalTo(sampleDevelopers.get(0).getName())))
                .andExpect(jsonPath("$.[0].username", equalTo(sampleDevelopers.get(0).getUsername())))
                .andExpect(jsonPath("$.[0].publicRepository", equalTo(sampleDevelopers.get(0).getPublicRepository())))
                .andExpect(jsonPath("$.[1].name", equalTo(sampleDevelopers.get(1).getName())))
                .andExpect(jsonPath("$.[1].username", equalTo(sampleDevelopers.get(1).getUsername())))
                .andExpect(jsonPath("$.[1].publicRepository", equalTo(sampleDevelopers.get(1).getPublicRepository())))
                .andExpect(jsonPath("$.[2].name", equalTo(sampleDevelopers.get(2).getName())))
                .andExpect(jsonPath("$.[2].username", equalTo(sampleDevelopers.get(2).getUsername())))
                .andExpect(jsonPath("$.[2].publicRepository", equalTo(sampleDevelopers.get(2).getPublicRepository())));
    }

    @Test
    public void testListAllDevelopersShouldReturnEmpty() throws Exception {
        when(developerService.findAll()).thenReturn(Collections.emptyList());

        mockMvc
                .perform(
                        get("/v1/developer")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", empty()));
    }

    @Test
    public void testDeleteByIdShouldRemoveDeveloper() throws Exception {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        doNothing().when(developerService).delete(any(Integer.class));

        mockMvc
                .perform(
                        delete("/v1/developer/{id}", sampleData.getId())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testDeleteDeveloperNotExistsShouldReturnInternalServerError() throws Exception {
        DeveloperResponseDTO sampleData = getSampleDeveloperV1();

        doThrow(new EntityNotFoundException()).when(developerService).delete(any(Integer.class));

        mockMvc
                .perform(
                        delete("/v1/developer/{id}", sampleData.getId())
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isInternalServerError());
    }

}
