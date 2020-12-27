package br.com.ffc.puc.tcc.devapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ffc.puc.tcc.devapi.model.Developer;

import java.util.Optional;

/**
 * 
 * @author fabricio
 *
 */
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

	/**
	 * 
	 * @param username
	 * @return
	 */
	boolean existsByUsername(String username);

	/**
	 * 
	 * @param username
	 * @return
	 */
	Optional<Developer> findByUsername(String username);
	
}
