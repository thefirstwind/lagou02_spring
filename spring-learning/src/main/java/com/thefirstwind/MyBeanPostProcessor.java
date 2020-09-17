package com.thefirstwind;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor(){
		System.out.println("MyBeanPostProcessor 构造器方法");

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("myBean".equalsIgnoreCase(beanName)){
			System.out.println("MyBeanPostProcessor postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("myBean".equalsIgnoreCase(beanName)){
			System.out.println("MyBeanPostProcessor postProcessAfterInitialization");
		}
		return bean;
	}

}
