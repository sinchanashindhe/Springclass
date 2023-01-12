package com.xworkz.qualifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.qualifier")
public class SnakeConfiguration {

	@Bean
	public String SnakeName() {
		System.out.println("Registering SnakeName in spring");
		return "Anakonda";
	}
	
	@Bean
	public float snakeLength() {
		System.out.println("Registering snakeLength in spring");
		return 15.5f;
	}
	
	@Bean
	public String snakeColour() {
		System.out.println("Registering snakeColour in spring");
		return "Block";
	}
	
	@Bean
	public String SnakeType() {
		System.out.println("Registering SnakeType in spring");
		return "Dangerous";
	}
	
	@Bean
	public boolean SnakePoisionous() {
		System.out.println("Registering SnakePoisionous in spring");
		return true;
	}

}
