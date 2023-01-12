package com.xworkz.configure;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class AutowiredConfiguration {

	@Bean
	public String name() {
		System.out.println("Registering name in spring");
		String ref=new String("Phone Pay");
		return ref;
	}
	
	@Bean
	public int version() {
		System.out.println("Registering version in spring");
		Integer ref=new Integer(5);
		return ref;
	}
	@Bean
	public String developer() {
		System.out.println("Registering developer in spring");
		String ref=new String("Uday");
		return ref;
	}
	
	@Bean
	public LocalDate date() {
		System.out.println("Registering developer in spring");
		
		return LocalDate.of(2023, 1, 10);
	}
	
	@Bean
	public boolean free() {
		return true;
	}
	
	
	
	@Bean
	public String rubberName() {
		System.out.println("Registering rubberName in spring");
		return "Apsara";
	}
	
	@Bean
	public String rubberType() {
		System.out.println("Registering rubberType in spring");
		return "Erase";
	}
	@Bean
	public double rubberPrice() {
		System.out.println("Registering price in spring");
		return 20;
	}
	@Bean
	public String rubberColour() {
		System.out.println("Registering rubberColour in spring");
		return "White";
	}
	@Bean
	public String rubberShape() {
		System.out.println("Registering rubberShape in spring");
		return "Rectangle";
	}
	@Bean
	public String size() {
		System.out.println("Registering size in spring");
		return "Small";
	}
	
	@Bean
	public String pencilName() {
		System.out.println("Registering name in spring");
		return "Nataraja";
	}
	@Bean
	public String type() {
		System.out.println("Registering type in spring");
		return "long";
	}
	@Bean
	public double price() {
		System.out.println("Registering price in spring");
		return 50d;
	}
	@Bean
	public String colour() {
		System.out.println("Registering name in spring");
		return "Red";
	}
	@Bean
	public boolean sharp() {
		System.out.println("Registering name in spring");
		return true;
	}
	
	
	@Bean
	public String watchName() {
		System.out.println("Registering watchName in spring");
		return "Foxin-5G";
	}
	
	@Bean
	public String watchBrand() {
		System.out.println("Registering watchBrand in spring");
		return "Foxin";
	}
	
	@Bean
	public double watchPrice() {
		System.out.println("Registering watchPrice in spring");
		return 5000d;
	}
	
	@Bean
	public String watchColour() {
		System.out.println("Registering watchColour in spring");
		return "block";
	}
	
	@Bean
	public float weight() {
		System.out.println("Registering weight in spring");
		return 5.2f;
	}
	

}
		



