package com.xworkz.qualifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.qualifier")
public class EngineConfiguration {

	
	@Bean
	public String engineName() {
		System.out.println("Registering engineName in Spring");
		return "Bike Engine";
	}
	
	@Bean
	public String engineType() {
		System.out.println("Registering engineType in Spring");
		return "Parallel Twin";
	}
	
	@Bean
	public int engineNumber() {
		System.out.println("Registering engineNumber in Spring");
		return 2546426;
	}
	
	@Bean
	public int engineVersion() {
		System.out.println("Registering engineVersion in Spring");
		return 3;
	}
	
	@Bean
	public String engineCompany() {
		System.out.println("Registering engineCompany in Spring");
		return "Royal Enfield";
	}
	
	@Bean
	public int enginStoke() {
		System.out.println("Registering enginStoke in Spring");
		return 4;
	}
}
