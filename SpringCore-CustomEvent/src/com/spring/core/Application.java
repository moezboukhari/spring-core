package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import event.UserDefinedEventHandler;
import event.UserDefinedEventPublisher;

public class Application {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new  FileSystemResource("beans.xml"));
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		Greetings greetings = (Greetings) applicationContext.getBean("greeting");
		System.out.println(greetings.getMessage());
		UserDefinedEventPublisher definedEventPublisher =  (UserDefinedEventPublisher) applicationContext.getBean("eventPublisher");
		
		definedEventPublisher.publish();
	}

       
}
