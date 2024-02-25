package com.Bank_Property_Evaluation.FIleUploadService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;

@EnableZeebeClient
@SpringBootApplication
public class FIleUploadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FIleUploadServiceApplication.class, args);
	}

}
