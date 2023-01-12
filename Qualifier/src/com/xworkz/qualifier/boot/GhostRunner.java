package com.xworkz.qualifier.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.qualifier.configuration.GhostConfiguration;
import com.xworkz.qualifier.things.Ghost;

public class GhostRunner {

	public static void main(String[] args) {
		
			
			ApplicationContext container=new AnnotationConfigApplicationContext(GhostConfiguration.class);
			String[] spring=container.getBeanDefinitionNames();
			System.out.println(Arrays.toString(spring));
			
			Ghost ghost=container.getBean(Ghost.class);
			System.out.println(ghost);


		}


}
