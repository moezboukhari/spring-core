package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.core.pojo.Greetings;
import com.spring.core.pojo.Greetings3;

@Configuration
public class BeanConfig {
	@Bean
	public Greetings createGreetingsBean () {
		Greetings greetings = new Greetings();
		greetings.setMessage("Bean with annotation and configuration");
		return greetings;
	}
	@Bean
	public Greetings3 createGreetingsBean3 () {
		Greetings3 greeting3 = new Greetings3();
		greeting3.setGreetings(createGreetingsBean());
		return greeting3;
	}

}
