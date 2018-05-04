package com.cit.apimusica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.cit.*")
@ComponentScan(basePackages="com.cit.*")
@EntityScan(basePackages="com.cit.*")
public class ApiMusicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMusicaApplication.class, args);
	}
}
