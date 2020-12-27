package br.com.ffc.puc.tcc.devapi.service;

import java.util.Optional;

import br.com.ffc.puc.tcc.devapi.client.dto.UserGithubApiDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.model.Developer;

/**
 * 
 * @author fabricio
 *
 */
public interface DeveloperService {
	
	public interface V1 {
		
		/**
		 * 
		 * @param username
		 * @return
		 */
		DeveloperResponseDTO save(String username);
		
		/**
		 * 
		 * @param username
		 * @return
		 */
	    Optional<DeveloperResponseDTO> findByUsername(String username);

	    /**
	     * 
	     * @return
	     */
	    Iterable<DeveloperResponseDTO> findAll();

	    /**
	     * 
	     * @param id
	     */
	    void delete(Integer id);
	    
	    /**
	     * 
	     * @param userGithubApiDTO
	     */
	    Developer convertGithubDtoToObject(UserGithubApiDTO userGithubApiDTO);
	    
	}

}
