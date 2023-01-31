package com.xworkz.laser.congiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laser")
public class SpringBeanConfiguration {
	
	public SpringBeanConfiguration() {
		System.out.println("created" +this.getClass().getSimpleName());
	}

}
