package com.uday.spring_security_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.repository")
public class SpringSecurityJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}
}

