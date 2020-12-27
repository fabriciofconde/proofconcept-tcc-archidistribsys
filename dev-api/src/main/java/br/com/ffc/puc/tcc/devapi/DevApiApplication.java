package br.com.ffc.puc.tcc.devapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author fabricio
 *
 */
@EnableFeignClients
@SpringBootApplication
public class DevApiApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DevApiApplication.class, args);
	}

}
