package com.nahom.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication(scanBasePackages = ("com.nahom.playground.${sec}"))
@EnableR2dbcRepositories(basePackages = ("com.nahom.playground.${sec}"))
public class WebfluxPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxPlaygroundApplication.class, args);
	}

}
