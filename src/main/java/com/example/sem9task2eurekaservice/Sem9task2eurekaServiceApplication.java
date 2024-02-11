package com.example.sem9task2eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sem9task2eurekaServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(Sem9task2eurekaServiceApplication.class, args);
	}

}
