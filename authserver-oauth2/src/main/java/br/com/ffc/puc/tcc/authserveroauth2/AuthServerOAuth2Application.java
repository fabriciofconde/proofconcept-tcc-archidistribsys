package br.com.ffc.puc.tcc.authserveroauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


/**
 * 
 * @author fabricio
 *
 */
@EnableAuthorizationServer
@SpringBootApplication
public class AuthServerOAuth2Application extends SpringBootServletInitializer {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AuthServerOAuth2Application.class, args);
	}

}
