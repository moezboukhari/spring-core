package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Application {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new  FileSystemResource("beans.xml"));
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		Greetings greetings = (Greetings) applicationContext.getBean("greeting");
		System.out.println(greetings.getMessage());
		applicationContext.registerShutdownHook();
		
	}

       
}
