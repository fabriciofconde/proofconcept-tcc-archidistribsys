package br.com.ffc.puc.tcc.devapi.service;

import br.com.ffc.puc.tcc.devapi.client.dto.RepoGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Repository;

/**
 * 
 * @author fabricio
 *
 */
public interface RepositoryService {
	
	public interface V1 {

	    /**
	     * 
	     * @return
	     */
	    Iterable<RepositoryResponseDTO> findAllByUsername(String username);
	    
	    
	    /**
	     * 
	     * @param repoGithubApiDTO
	     */
	    Repository convertGithubDtoToObject(RepoGithubApiDTO repoGithubApiDTO);
	    
	}

}
