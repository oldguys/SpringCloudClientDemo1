package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class SpringCloudClientDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientDemo1Application.class, args);
	}

}
