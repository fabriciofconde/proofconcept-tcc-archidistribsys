package br.com.ffc.puc.tcc.devapi.repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ffc.puc.tcc.devapi.config.BaseTest;
import br.com.ffc.puc.tcc.devapi.config.WebConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author fabricio
 *
 */
@Import(WebConfig.class)
public class BaseRepositoryTest extends BaseTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
