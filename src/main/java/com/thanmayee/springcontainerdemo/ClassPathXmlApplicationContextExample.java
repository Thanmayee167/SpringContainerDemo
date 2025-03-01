package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {
	/**
	 * Main method to initialize ApplicationContext using
	 * ClassPathXmlApplicationContext and retrieve a bean.
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		PrintingMachine printingMachine = (PrintingMachine) context.getBean("printingMachine");
		printingMachine.print();
	}
}