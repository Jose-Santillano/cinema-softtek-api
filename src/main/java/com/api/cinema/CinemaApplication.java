package com.api.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	//Bean inyectable para utilizar RestTemplate para hacer una petición a una API externa.
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
