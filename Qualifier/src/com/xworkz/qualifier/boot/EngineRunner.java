package com.xworkz.qualifier.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.qualifier.configuration.EngineConfiguration;
import com.xworkz.qualifier.things.Engine;

public class EngineRunner {

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub
			
			ApplicationContext container=new AnnotationConfigApplicationContext(EngineConfiguration.class);
			String[] spring=container.getBeanDefinitionNames();
			System.out.println(Arrays.toString(spring));
			
			Engine paper=container.getBean(Engine.class);
			System.out.println(paper);

		}
}
