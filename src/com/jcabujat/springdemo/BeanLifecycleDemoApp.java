package com.jcabujat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);	
		
		// check is they are the same bean
		System.out.println(theCoach == alphaCoach);
		
		// close the context
		context.close();

	}

}
