package br.com.ffc.puc.tcc.devapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ffc.puc.tcc.devapi.model.Repository;

/**
 *
 */
public interface RepositoryRepository extends JpaRepository<Repository, Integer> {

    /**
     *
     * @param username
     * @return
     */
    @Query("SELECT r FROM Repository r left join r.developer d WHERE d.username = ?1")
    Iterable<Repository> findAllByUsernameDeveloper(String username);

}
