package br.com.ffc.puc.tcc.devapi.config;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Import;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.client.dto.UserGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.model.Repository;

/**
 * 
 * @author fabricio
 *
 */
@Import(WebConfig.class)
public abstract class BaseTest {

    private final static String PATH_RESOURCES = "src/test/resources/";

    public abstract ObjectMapper getObjectMapper();

    protected <T> T fromJson(String json, Class<T> classOfT) throws JsonProcessingException {
        return getObjectMapper().readValue(json, classOfT);
    }

    protected <T> T fromJson(String json, TypeReference<T> typeReferenceOfT) throws JsonProcessingException {
        return getObjectMapper().readValue(json, typeReferenceOfT);
    }

    protected String read(String fileName) throws IOException {
        return FileUtils.readFileToString(new File(String.format("%s%s", PATH_RESOURCES, fileName)));
    }

    protected DeveloperResponseDTO getSampleDeveloperV1() {
        try {
            String devJson = read("samples/v1/developer.json");
            return fromJson(devJson, DeveloperResponseDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Developer getSampleDeveloper() {
        return new Developer(
                1, null, "fabriciofconde", "https://avatars0.githubusercontent.com/u/2835024?v=4",
                "Fabrício Condé", "BHS", "Belo Horizonte, Brazil", "fabriciofconde@gmail.com",
                null, null, 21, 0, 6, LocalDateTime.now(), LocalDateTime.now(),
                LocalDateTime.now());
    }

    protected List<Developer> getSampleDevelopers() {
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(getSampleDeveloper());
        return developers;
    }

    protected Repository getSampleRepository() {
        return new Repository(
                1, 1, getSampleDeveloper(), "activerecord2java", null,
                LocalDateTime.now(), false, 626, 0, 0);
    }

    protected List<Repository> getSampleRepositories() {
        ArrayList<Repository> repositories = new ArrayList<>();
        repositories.add(getSampleRepository());
        return repositories;
    }

    protected List<DeveloperResponseDTO> getSampleDevelopersV1() {
        try {
            String devsJson = read("samples/v1/developers.json");
            return fromJson(devsJson, new TypeReference<List<DeveloperResponseDTO>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected List<RepositoryResponseDTO> getSampleRepositoriesV1() {
        try {
            String reposJson = read("samples/v1/repositories.json");
            return fromJson(reposJson, new TypeReference<List<RepositoryResponseDTO>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected UserGithubApiDTO getSampleUserGithubApiDTO() {
        try {
            String userJson = read("samples/user-github.json");
            return fromJson(userJson, UserGithubApiDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected RepoGithubApiDTO getSampleRepoGithubApiDTO() {
        try {
            String repoJson = read("samples/repo-github.json");
            return fromJson(repoJson, RepoGithubApiDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected List<RepoGithubApiDTO> getSampleReposGithubApiDTO() {
        try {
            String repoJson = read("samples/repos-github.json");
            return fromJson(repoJson, new TypeReference<List<RepoGithubApiDTO>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
