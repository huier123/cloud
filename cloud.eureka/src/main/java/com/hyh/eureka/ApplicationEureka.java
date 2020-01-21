package com.hyh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author houyh4
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEureka.class, args);
	}

}
