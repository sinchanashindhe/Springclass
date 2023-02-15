package com.xworkz.instead.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.instead")
public class CountryConfiguration {

	public CountryConfiguration() {
      System.out.println("created"+ this.getClass().getSimpleName());
	}
	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("registering ViewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean 
	localContainerEntityManagerFactoryBean(){
	System.out.println("registering LocalContainerEntityManagerFactoryBean");
	LocalContainerEntityManagerFactoryBean bean
	= new LocalContainerEntityManagerFactoryBean();
	return bean;
}
}