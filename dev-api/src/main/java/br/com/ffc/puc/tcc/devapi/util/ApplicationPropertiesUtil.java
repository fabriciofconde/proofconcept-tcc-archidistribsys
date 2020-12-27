package br.com.ffc.puc.tcc.devapi.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

/**
 * 
 * @author fabricio
 *
 */
@Getter
@ConfigurationProperties
@Configuration
public class ApplicationPropertiesUtil {
	
	@Value("${tokenservices.client-id}")
    private String clientId;

    @Value("${tokenservices.client-secret}")
    private String clienteSecret;
    
    @Value("${tokenservices.auth-token-endpoint-url}")
    private String authTokenEndpointUrl;

    @Value("${tokenservices.check-token-endpoint-url}")
    private String checkTokenEndpointUrl;
    
}
