package com.thefirstwind;

import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean {

	public MyBean(){
		System.out.println("MyBean 构造方法");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean afterPropertiesSet");
	}
}
