package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.core.pojo.Greetings;
import com.spring.core.pojo.Greetings2;

@Configuration
public class BeanConfig2 {
	@Bean
	@Scope(value="prototype")
	public Greetings2 createGreetingsBean () {
		Greetings2 greetings = new Greetings2();
		greetings.setMessage("Bean with annotation and configuration");
		return greetings;
	}

}
