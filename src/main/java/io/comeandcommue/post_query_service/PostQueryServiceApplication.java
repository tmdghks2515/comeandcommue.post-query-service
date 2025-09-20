package io.comeandcommue.post_query_service;

import io.comeandcommue.lib.web.exception.EnableGlobalExceptionHandling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableGlobalExceptionHandling
@ComponentScan(basePackages = {
		"io.comeandcommue.post_query_service",
		"io.comeandcommue.lib.web"
})
public class PostQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostQueryServiceApplication.class, args);
	}

}
