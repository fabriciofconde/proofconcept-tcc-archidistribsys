package br.com.ffc.puc.tcc.devapi.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ffc.puc.tcc.devapi.controller.v1.dto.DeveloperResponseDTO;
import br.com.ffc.puc.tcc.devapi.controller.v1.dto.RepositoryResponseDTO;
import br.com.ffc.puc.tcc.devapi.service.DeveloperService;
import br.com.ffc.puc.tcc.devapi.service.RepositoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author fabricio
 *
 */
@Api("Desenvolvedores")
@RestController(DeveloperController.QUALIFIER)
@RequestMapping("/v1/developer")
public class DeveloperController {
	
	public static final String QUALIFIER = "DeveloperControllerV1";
	
	@Autowired
	private DeveloperService.V1 developerService;

	@Autowired
	private RepositoryService.V1 repositoryService;
	

	/**
	 * 
	 * @param username
	 * @return
	 */
	@ApiOperation(value = "Create a new developer from by username github")
    @RequestMapping(value = "/{username}", method = RequestMethod.POST)
    public ResponseEntity<DeveloperResponseDTO> save(@PathVariable String username){
        return ResponseEntity.ok(developerService.save(username));
    }

    /**
     * 
     * @param username
     * @return
     */
	@ApiOperation(value = "Return a developer with username argument path")
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public ResponseEntity<DeveloperResponseDTO> getByUsername(@PathVariable("username") String username) {
    	return ResponseEntity.of(developerService.findByUsername(username));
    }

    /**
     *
     * @param username
     * @return
     */
	@ApiOperation(value = "Return all repositories with username argument path")
    @RequestMapping(value = "/{username}/repositories", method = RequestMethod.GET)
    public ResponseEntity<Iterable<RepositoryResponseDTO>> listRepositoriesByUsername(@PathVariable("username") String username) {
        return ResponseEntity.ok(repositoryService.findAllByUsername(username));
    }

    /**
     * 
     * @return
     */
	@ApiOperation(value = "Return all developers")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<DeveloperResponseDTO>> listAll(){
        return ResponseEntity.ok().body(developerService.findAll());
    }

    /**
     * 
     * @param id
     * @return
     */
	@ApiOperation(value = "Delete a developer with id argument path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        developerService.delete(id);
        return ResponseEntity.ok().build();
    }
	
}
