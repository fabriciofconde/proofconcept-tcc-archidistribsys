package br.com.ffc.puc.tcc.devapi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.ffc.puc.tcc.devapi.model.Developer;
import br.com.ffc.puc.tcc.devapi.model.Repository;
import br.com.ffc.puc.tcc.devapi.repository.RepositoryRepository;

/**
 * 
 * @author fabricio
 *
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RepositoryRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private RepositoryRepository repositoryRepository;


    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(repositoryRepository).isNotNull();
    }


    @Test
    @Rollback
    void testFindAllShouldReturnRepositories() {
        Developer developer = getSampleDeveloper();
        Iterable<Repository> repositories = repositoryRepository.findAllByUsernameDeveloper(developer.getUsername());
        assertThat(repositories).isNotNull();
    }

}
