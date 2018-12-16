package de.royal.bipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BiproWsMockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiproWsMockServiceApplication.class, args);
	}

}

