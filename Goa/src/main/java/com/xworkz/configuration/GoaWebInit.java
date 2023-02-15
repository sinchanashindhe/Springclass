package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	public GoaWebInit() {
		System.out.println("created no arguments  constructor");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] ref= {SpringConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		return new String[] {"/"};
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
}
}
