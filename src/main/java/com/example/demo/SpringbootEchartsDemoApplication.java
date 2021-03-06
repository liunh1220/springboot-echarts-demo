package com.example.demo;

import com.example.demo.config.BaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BaseConfiguration.class})
public class SpringbootEchartsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEchartsDemoApplication.class, args);
	}
}
