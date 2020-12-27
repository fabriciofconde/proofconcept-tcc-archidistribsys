package br.com.ffc.puc.tcc.devapi.smoke;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ffc.puc.tcc.devapi.controller.v1.DeveloperController;

/**
 * 
 * @author fabricio
 *
 */
@SpringBootTest
public class SmokeTest {

    @Autowired
    private DeveloperController developerController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(developerController).isNotNull();
    }

}
