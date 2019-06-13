package com.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.config.BeanConfig;
import com.spring.core.config.BeanConfig2;
import com.spring.core.pojo.Greetings;
import com.spring.core.pojo.Greetings2;
import com.spring.core.pojo.Greetings3;


public class Application {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new  FileSystemResource("beans.xml"));
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		applicationContext.register(BeanConfig.class,BeanConfig2.class);
		applicationContext.refresh();
		
		Greetings greetings = (Greetings) applicationContext.getBean(Greetings.class);
		Greetings2 	 greetings2 = (Greetings2) applicationContext.getBean(Greetings2.class);

Greetings3 greetings3 = (Greetings3)  applicationContext.getBean(Greetings3.class);
greetings2.setMessage("Singleton annotation 22");
		System.out.println(greetings+greetings.getMessage());
		System.out.println(greetings2+greetings2.getMessage());
		System.out.println(greetings3+greetings3.getGreetings().getMessage());


		
	}

       
}
