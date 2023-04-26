package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.product.components.user")
@Import({com.example.product.config.OAuth2AuthorizationServerConfig.class, com.example.product.config.SecurityConfig.class})
public class FilmFolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmFolioApplication.class, args);
	}

}
