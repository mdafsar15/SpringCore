package com.genx.springcore.automanual;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/springcore/automanual/config.xml");

		Address emp = context.getBean("ad", Address.class);

		System.out.println(emp);
	}

}


//@Qualifier



