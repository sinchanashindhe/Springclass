package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.AutowiredConfiguration;
import com.xworkz.type.Pencil;

public class PencilRunner {

	public static void main(String[] args) {

		

		ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		Pencil pencil=container.getBean(Pencil.class);
		System.out.println(pencil);
		

	}

}
