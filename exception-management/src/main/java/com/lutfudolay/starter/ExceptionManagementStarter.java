package com.lutfudolay.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.persistence.Entity;
@EntityScan(basePackages = {"com.lutfudolay"})
@EnableJpaRepositories(basePackages = {"com.lutfudolay"})
@ComponentScan(basePackages = {"com.lutfudolay"})
@EnableScheduling
@SpringBootApplication
public class ExceptionManagementStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementStarter.class, args);
	}

}
