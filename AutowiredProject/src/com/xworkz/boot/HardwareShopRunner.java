package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.AutowiredConfiguration;
import com.xworkz.type.HardwareShop;

public class HardwareShopRunner {

	public static void main(String[] args) {
		
			ApplicationContext container=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
			String[] spring=container.getBeanDefinitionNames();
			System.out.println(Arrays.toString(spring));
			
			HardwareShop shop=container.getBean(HardwareShop.class);
			System.out.println(shop);
	}
}
	


