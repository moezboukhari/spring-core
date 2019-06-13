package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Processor implements BeanPostProcessor {
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("Befor init bean + "+bean+" name= "+beanName);
	return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
}
@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
System.out.println("After init bean + "+bean+" name= "+beanName);
return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
