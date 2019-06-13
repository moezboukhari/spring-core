package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	@Bean
	@Scope(value="prototype")
	public Greetings createGreetingsBean () {
		Greetings greetings = new Greetings();
		greetings.setMessage("Bean with annotation and configuration");
		return greetings;
	}

}
