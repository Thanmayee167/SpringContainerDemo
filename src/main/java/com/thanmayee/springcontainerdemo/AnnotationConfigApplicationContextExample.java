package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample {
	/**
	 * Main method to initialize ApplicationContext and retrieve a bean.
	 */
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PrintingMachine printingMachine = context.getBean(PrintingMachine.class);
		printingMachine.print();
	}
}