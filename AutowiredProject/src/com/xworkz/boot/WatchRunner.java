package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.AutowiredConfiguration;
import com.xworkz.type.SmartWatch;

public class WatchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		SmartWatch shop=container.getBean(SmartWatch.class);
		System.out.println(shop);

	}

}
