package com.xworkz.qualifier.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.qualifier.configuration.NewsPaperConfigarion;
import com.xworkz.qualifier.things.NewsPaper;

public class PaperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(NewsPaperConfigarion.class);
		String[] ref=container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(ref));
		
		NewsPaper paper=container.getBean(NewsPaper.class);
		System.out.println(paper);
	}

}
