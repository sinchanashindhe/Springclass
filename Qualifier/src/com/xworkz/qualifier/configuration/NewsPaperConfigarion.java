package com.xworkz.qualifier.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.qualifier")
public class NewsPaperConfigarion {
	
	@Autowired
	@Qualifier("newsPaperLocation")
	private String location;
	
	public NewsPaperConfigarion() {
		System.out.println("Registering one more Bean in Configuration");
	}
	
	@Bean
	public  String  newsPaperLocation() {
		System.out.println("Rigistering newsPaperLocation in spring");
		
		return "Bengalur";
	}
	
	@Bean
	public  int newsPaperId() {
		System.out.println("Rigistering newsPaperId in spring");
		
		return 101;
	}
	
	@Bean
	public  String  newsPaperName() {
		System.out.println("Rigistering newsPaperName in spring");
		
		return "Prajavani";
	}
	
	@Bean
	public  String newsPaperOwnerName() {
		System.out.println("Rigistering newsPaperOwnerName in spring");
		
		return "Uday";
	}
	
	@Bean
	public  String newPaperLanguage() {
		System.out.println("Rigistering newPaperLanguage in spring");
		
		return "Kannada";
	}
	
	@Bean
	public  double newsPaperPrice() {
		System.out.println("Rigistering newsPaperPrice in spring");
		
		return 10;
	}
	

}
