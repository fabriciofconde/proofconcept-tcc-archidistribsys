package br.com.ffc.puc.tcc.devapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.client.dto.UserGithubApiDTO;

import java.util.List;

/**
 * 
 * @author fabricio
 *
 */
@FeignClient(name = "githubApiClient", url = "https://api.github.com")
public interface GithubApiClient {
	
	/**
	 * 
	 * @param login
	 * @return
	 */
	@GetMapping("/users/{login}")
    UserGithubApiDTO getUserByLogin(@PathVariable("login") String login);

	/**
	 *
	 * @param login
	 * @return
	 */
	@GetMapping("/users/{login}/repos")
	List<RepoGithubApiDTO> getReposByLogin(@PathVariable("login") String login);

}
