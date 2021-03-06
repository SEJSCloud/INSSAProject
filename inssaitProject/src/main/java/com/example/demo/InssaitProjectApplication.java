package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"inssait.controller", "inssait.service"})
@EnableJpaRepositories(basePackages="inssait.model.dao")
@EntityScan("inssait.model.domain")
public class InssaitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InssaitProjectApplication.class, args);
	}

}
