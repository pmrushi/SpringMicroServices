package com.example.apigateway.apigateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
class ApigatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication, args)
	}

}
