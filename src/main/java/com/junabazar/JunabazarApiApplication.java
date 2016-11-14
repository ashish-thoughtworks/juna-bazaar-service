package com.junabazar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JunabazarApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunabazarApiApplication.class, args);
	}
}
