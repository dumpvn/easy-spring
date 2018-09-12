package com.tutorialpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("new message");
		obj.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
	}
}
