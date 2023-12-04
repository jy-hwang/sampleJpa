package com.owl.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SampleJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJpaApplication.class, args);
	}

}
