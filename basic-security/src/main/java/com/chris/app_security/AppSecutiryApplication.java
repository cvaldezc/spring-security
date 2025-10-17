package com.chris.app_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AppSecutiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSecutiryApplication.class, args);
	}

}
