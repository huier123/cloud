package com.hyh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author houyh4
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationUser {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationUser.class, args);
	}

}
