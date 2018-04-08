package com.fang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //注解@EnableZuulProxy，开启zuul的功能
public class SericeZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeZuulApplication.class, args);
	}
}
