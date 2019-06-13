package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new  FileSystemResource("beans.xml"));
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		Greetings greetings = (Greetings) applicationContext.getBean(Greetings.class);
		Greetings greetings2 = (Greetings) applicationContext.getBean(Greetings.class);
		System.out.println(greetings+greetings.getMessage());

greetings2.setMessage("Singleton annotation 22");
		System.out.println(greetings+greetings.getMessage());
		System.out.println(greetings2+greetings2.getMessage());


		
	}

       
}
