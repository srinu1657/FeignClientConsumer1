package com.example.FeignClientConsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class FeignClientConsumer1Application {
	public static void main(String[] args) {
		SpringApplication.run(FeignClientConsumer1Application.class, args);
	}
}
