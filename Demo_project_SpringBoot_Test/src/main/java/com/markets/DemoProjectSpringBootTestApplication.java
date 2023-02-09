package com.markets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()

public class DemoProjectSpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectSpringBootTestApplication.class, args);
	}

}
