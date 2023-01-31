package com.xworkz.laser.congiguration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringWebInit() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses ");
		Class[] configclass = {SpringBeanConfiguration.class };
		System.out.println("configuration:" + Arrays.toString(configclass));

		return configclass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the getServletMappings");
		String[] ref = { "/" };
		System.out.println("getServletMappings" + Arrays.toString(ref));
		return ref;
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}
