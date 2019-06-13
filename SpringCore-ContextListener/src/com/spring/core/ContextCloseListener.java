package com.spring.core;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextCloseListener implements ApplicationListener<ContextClosedEvent>{
@Override
public void onApplicationEvent(ContextClosedEvent event) {
	System.out.println("closing listner event "+event.getSource());		
	
}
}
