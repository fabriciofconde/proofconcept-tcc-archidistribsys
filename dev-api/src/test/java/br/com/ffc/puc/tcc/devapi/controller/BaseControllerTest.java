package br.com.ffc.puc.tcc.devapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ffc.puc.tcc.devapi.config.BaseTest;
import br.com.ffc.puc.tcc.devapi.config.WebConfig;

/**
 * 
 * @author fabricio
 *
 */
@Import(WebConfig.class)
public class BaseControllerTest extends BaseTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

}
