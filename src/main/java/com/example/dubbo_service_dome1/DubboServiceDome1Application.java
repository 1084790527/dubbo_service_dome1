package com.example.dubbo_service_dome1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboServiceDome1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DubboServiceDome1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DubboServiceDome1Application.class, args);
	}

}
