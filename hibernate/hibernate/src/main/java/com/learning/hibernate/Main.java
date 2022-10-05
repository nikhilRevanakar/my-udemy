package com.learning.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ApplicationContext context 
	      = new ClassPathXmlApplicationContext("application.xml");
		User bean = context.getBean("user", User.class);
		System.out.println(bean);
		System.out.println(bean.hashCode());
		bean.setAddress("Shimoga");
		
		
		User bean2 = context.getBean("user", User.class);
		System.out.println(bean2);
		System.out.println(bean2.hashCode());
		
		
	}

}
