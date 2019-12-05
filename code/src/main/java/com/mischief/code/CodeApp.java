package com.mischief.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CodeApp {

	public static void main(String[] args) {
		SpringApplication.run(CodeApp.class, args);
	}

}
