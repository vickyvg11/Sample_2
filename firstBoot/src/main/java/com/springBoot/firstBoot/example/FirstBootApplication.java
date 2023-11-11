package com.springBoot.firstBoot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springBoot.firstBoot","com.india"})
public class FirstBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(FirstBootApplication.class, args);
		System.out.println(cont.getClass().getName());
		 System.out.println("Bean Loaded"+cont.getBeanDefinitionCount());
		
	}

}
