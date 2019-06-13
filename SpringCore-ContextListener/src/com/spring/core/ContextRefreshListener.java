package com.spring.core;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshListener implements ApplicationListener<ContextRefreshedEvent>{
@Override
public void onApplicationEvent(ContextRefreshedEvent event) {
	System.out.println("REFRESH "+event.getSource());		
	
}
}
