package com.gabrielferreira02.bsstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class BsstatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsstatsApplication.class, args);
	}

}
