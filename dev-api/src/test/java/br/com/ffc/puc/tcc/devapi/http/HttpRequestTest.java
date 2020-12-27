package br.com.ffc.puc.tcc.devapi.http;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.Serializable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import lombok.Data;

/**
 * 
 * @author fabricio
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetActuatorInfo() throws Exception {
        ActuatorDTO actuatorDTO = this.restTemplate.getForObject("http://localhost:" + port + "/api/actuator/health", ActuatorDTO.class);
        assertThat("UP".equals(actuatorDTO.getStatus()));
    }

    @Data
    private static class ActuatorDTO implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String status;

    }
    
}
