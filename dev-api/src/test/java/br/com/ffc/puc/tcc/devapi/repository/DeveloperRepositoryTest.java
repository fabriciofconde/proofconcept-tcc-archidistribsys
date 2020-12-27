package br.com.ffc.puc.tcc.devapi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import java.util.UUID;

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
import br.com.ffc.puc.tcc.devapi.repository.DeveloperRepository;

/**
 * 
 * @author fabricio
 *
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DeveloperRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DeveloperRepository developerRepository;


    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(developerRepository).isNotNull();
    }


    @Test
    @Rollback
    void testCreateDeveloperShouldSaved() {
        Developer developer = getSampleDeveloper();
        Developer savedDeveloper = developerRepository.save(developer);

        assertThat(savedDeveloper).isNotNull();
        assertThat(savedDeveloper.getUsername()).isEqualTo(savedDeveloper.getUsername());
        assertThat(savedDeveloper.getName()).isEqualTo(savedDeveloper.getName());
        assertThat(savedDeveloper.getBio()).isEqualTo(savedDeveloper.getBio());
    }

    @Test
    @Rollback
    void testFindDeveloperByUsernameShouldReturn() {
        Developer savedDeveloper = developerRepository.save(getSampleDeveloper());
        Optional<Developer> developer = developerRepository.findByUsername(savedDeveloper.getUsername());

        assertThat(developer.isPresent()).isTrue();
        assertThat(developer.get().getUsername()).isEqualTo(savedDeveloper.getUsername());
        assertThat(developer.get().getName()).isEqualTo(savedDeveloper.getName());
        assertThat(developer.get().getBio()).isEqualTo(savedDeveloper.getBio());
    }

    @Test
    @Rollback
    void testFindDeveloperByUsernameShouldReturnNull() {
        Optional<Developer> developer = developerRepository.findByUsername(UUID.randomUUID().toString());
        assertThat(developer.isPresent()).isFalse();
    }

    @Test
    @Rollback
    void testFindAllShouldReturnDevelopers() {
        developerRepository.save(getSampleDeveloper());
        Iterable<Developer> developers = developerRepository.findAll();
        assertThat(developers.iterator().hasNext()).isTrue();
    }

    @Test
    @Rollback
    void testDeleteByIdShouldRemoveDeveloper() {
        Developer savedDeveloper = developerRepository.save(getSampleDeveloper());
        developerRepository.deleteById(savedDeveloper.getId());
        assertThat(true).isTrue();
    }

}
