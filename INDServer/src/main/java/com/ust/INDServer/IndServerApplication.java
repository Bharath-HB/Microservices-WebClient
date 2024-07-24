package com.ust.INDServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class IndServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndServerApplication.class, args);
	}

}
