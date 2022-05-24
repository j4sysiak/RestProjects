package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableFeignClient
@SpringBootApplication
@EnableSwagger2    //http://localhost:8080/api/v1/swagger-ui.html
public class RestApiFullExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiFullExampleApplication.class, args);
	}
}
