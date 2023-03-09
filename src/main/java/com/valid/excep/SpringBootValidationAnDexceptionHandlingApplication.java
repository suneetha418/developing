package com.valid.excep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootValidationAnDexceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidationAnDexceptionHandlingApplication.class, args);
	}

}
