package br.com.ffc.puc.tcc.devapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import br.com.ffc.puc.tcc.devapi.config.BaseTest;

/**
 * 
 * @author fabricio
 *
 */
public class BaseServiceTest extends BaseTest {

    @Override
    public ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

}
