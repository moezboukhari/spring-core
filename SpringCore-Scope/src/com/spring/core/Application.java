package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new  FileSystemResource("beans.xml"));
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
		Greetings greetings = (Greetings) applicationContext.getBean("greeting");
		System.out.println(greetings+"  "+greetings.getMessage());
		Greetings greetings2 = (Greetings) applicationContext.getBean("greeting");
		greetings2.setMessage("message 222");
		System.out.println(greetings2+"  "+greetings2.getMessage());
		System.out.println(greetings+"  "+greetings.getMessage());
applicationContext.registerShutdownHook();


	}

       
}
