package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.core.pojo.Greetings;

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
