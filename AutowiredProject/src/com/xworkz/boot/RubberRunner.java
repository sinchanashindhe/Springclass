package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.AutowiredConfiguration;
import com.xworkz.type.Rubber;

public class RubberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		Rubber shop=container.getBean(Rubber.class);
		System.out.println(shop);


	}

}
