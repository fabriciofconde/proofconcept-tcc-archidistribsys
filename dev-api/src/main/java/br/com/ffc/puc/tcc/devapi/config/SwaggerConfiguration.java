package br.com.ffc.puc.tcc.devapi.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ffc.puc.tcc.devapi.util.ApplicationPropertiesUtil;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.GrantType;
import springfox.documentation.service.OAuth;
import springfox.documentation.service.ResourceOwnerPasswordCredentialsGrant;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author fabricio
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
	
	@Autowired
    private ApplicationPropertiesUtil properties;
	
	@Bean
    public Docket api() { 
		List<ResponseMessage> list = new java.util.ArrayList<>();
        list.add(new ResponseMessageBuilder().code(500).message("500 message").responseModel(new ModelRef("Result")).build());
        list.add(new ResponseMessageBuilder().code(401).message("Unauthorized").responseModel(new ModelRef("Result")).build());

        return new Docket(DocumentationType.SWAGGER_2)
        		.select()
        		.apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
	                .securitySchemes(Collections.singletonList(securitySchema()))
	                .pathMapping("/")
	                .useDefaultResponseMessages(false)
	                .apiInfo(apiInfo())
	                .globalResponseMessage(RequestMethod.GET, list)
	                .globalResponseMessage(RequestMethod.POST, list)
	                .globalResponseMessage(RequestMethod.DELETE, list);                                     
    }
	
	private OAuth securitySchema() {
        List<AuthorizationScope> authorizationScopeList = new ArrayList<>();
        authorizationScopeList.add(new AuthorizationScope("all", "All permissions"));
        
        List<GrantType> grantTypes = new ArrayList<>();
        GrantType creGrant = new ResourceOwnerPasswordCredentialsGrant(properties.getAuthTokenEndpointUrl());
        grantTypes.add(creGrant);
        
        return new OAuth("oauth2schema", authorizationScopeList, grantTypes);
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        		.title("API Developers - Challenge software enginer")
        		.description("Permitir cadastrar na base de dados desenvolvedores e seus projetos que estão no github")
                .termsOfServiceUrl("http://localhost:8081/api")
                .contact(new Contact("Fabrício Freitas Condé", "https://github.com/fabriciofconde", "fabriciofconde@gmail.com"))
                .version("1.0.0")
                .build();
    }

}
