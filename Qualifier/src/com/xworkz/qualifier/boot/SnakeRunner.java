package com.xworkz.qualifier.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.qualifier.configuration.SnakeConfiguration;
import com.xworkz.qualifier.things.Snake;

public class SnakeRunner {

	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ApplicationContext container=new AnnotationConfigApplicationContext(SnakeConfiguration.class);
			String[] spring=container.getBeanDefinitionNames();
			System.out.println(Arrays.toString(spring));
			
			Snake snake=container.getBean(Snake.class);
			System.out.println(snake);

		}

}
