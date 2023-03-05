package com.csuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.csuf.*")
@EntityScan("com.csuf.entity")
@EnableJpaRepositories(basePackages = {"com.csuf.repo"})
@SpringBootApplication
public class GraphqlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlAppApplication.class, args);
	}

}
