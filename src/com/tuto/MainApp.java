package com.tuto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te = (TextEditor) applicationContext.getBean("textEditor"); 
		
		te.spellCheck();
		System.out.println("name = " + te.getName());
		
		((AbstractApplicationContext)applicationContext).close();
	}

}
