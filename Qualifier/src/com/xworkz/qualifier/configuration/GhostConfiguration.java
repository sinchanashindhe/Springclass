package com.xworkz.qualifier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.qualifier")
public class GhostConfiguration {

	@Bean
	public String ghostName() {
		System.out.println("Registering ghostName in Spring ");
		return "Shashi";
	}
	
	@Bean
	public String ghostGender() {
		System.out.println("Registering ghostGender in Spring ");
		return "Male";
	}
	
	@Bean
	public LocalDate ghostDeathDate() {
		System.out.println("Registering ghostDeathDate in Spring ");
		return LocalDate.of(2023, 1, 25);
	}
	@Bean
	public LocalDate ghostBirthDate() {
		System.out.println("Registering ghostBirthDate in Spring ");
		return LocalDate.of(2000, 1, 25);
	}
	
	@Bean
	public String ghostDeathLocation() {
		System.out.println("Registering ghostDeathLocation in Spring ");
		return "X-workz";
	}
	
	@Bean
	public String ghostReason() {
		System.out.println("Registering ghostReason in Spring ");
		return "No-Job";
	}
	
	@Bean
	public String ghostAlive() {
		System.out.println("Registering ghostAlive in Spring ");
		return "Hell";
	}
	
	@Bean
	public float ghostNailLength() {
		System.out.println("Registering ghostNailLength in Spring ");
		return 5.5f;
	}
	
	@Bean
	public String ghostDressCode() {
		System.out.println("Registering ghostDressCode in Spring ");
		return "White";
	}
	
	@Bean
	public String ghostfreindName() {
		System.out.println("Registering ghostfreindName in Spring ");
		return "Uday";
	}
	@Bean
	public float ghostHair() {
		System.out.println("Registering ghostHair in Spring ");
		return 6f;
	}
	@Bean
	public boolean ghostMarried() {
		System.out.println("Registering ghostMarried in Spring ");
		return true;
	}
	@Bean
	public String ghostWifeName() {
		System.out.println("Registering ghostWifeName in Spring ");
		return "Vishnavi";
	}
	@Bean
	public String ghostEnemy() {
		System.out.println("Registering ghostEnemy in Spring ");
		return "Spoorthy";
	}
	@Bean
	public int ghostId() {
		System.out.println("Registering ghostId in Spring ");
		return 420;
	}
	@Bean
	public double ghostAdhar() {
		System.out.println("Registering ghostAdhar in Spring ");
		return 21469784d;
	}
	@Bean
	public String ghostFather() {
		System.out.println("Registering ghostFather in Spring ");
		return "Gottilla";
	}
	@Bean
	public String ghostMother() {
		System.out.println("Registering ghostMother in Spring ");
		return "Gottilla";
	}
	@Bean
	public boolean ghostDangerous() {
		System.out.println("Registering ghostDangerous in Spring ");
		return false;
	}
	@Bean
	public boolean ghostHandsome() {
		System.out.println("Registering ghostHandsome in Spring ");
		return false;
	}

}
