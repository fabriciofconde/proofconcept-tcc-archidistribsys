package br.com.ffc.puc.tcc.devapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

import br.com.ffc.puc.tcc.devapi.util.ApplicationPropertiesUtil;

/**
 * 
 * @author fabricio
 *
 */
@EnableResourceServer
@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Autowired
    private ApplicationPropertiesUtil properties;

    @Autowired
    private WebEndpointProperties webEndpointProperties;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
        	.authorizeRequests().antMatchers(
        		"/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui.html",
                "/webjars/**")
        	.permitAll()
        	.and()
            .authorizeRequests().antMatchers(webEndpointProperties.getBasePath()+"/health").permitAll()
            .and()
            .authorizeRequests().anyRequest().authenticated();
    }

    @Bean
    public ResourceServerTokenServices tokenService() {
        RemoteTokenServices tokenServices = new RemoteTokenServices();
        tokenServices.setClientId(properties.getClientId());
        tokenServices.setClientSecret(properties.getClienteSecret());
        tokenServices.setCheckTokenEndpointUrl(properties.getCheckTokenEndpointUrl());
        return tokenServices;
    }

}
