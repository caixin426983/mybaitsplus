package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example"})
@MapperScan("com.example.mapper")
@SpringBootApplication
public class MybaitsplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybaitsplusApplication.class, args);
	}
}
