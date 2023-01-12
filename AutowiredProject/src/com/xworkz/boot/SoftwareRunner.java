package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.AutowiredConfiguration;
import com.xworkz.type.Software;

public class SoftwareRunner {

	ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
	String[] spring=container.getBeanDefinitionNames();
	System.out.println(Arrays.toString(spring));
	
	Software shop=container.getBean(Software.class);
	System.out.println(shop);



}

	
	
	
	
