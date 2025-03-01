package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextExample {
	/**
	 * Main method to initialize ApplicationContext using
	 * FileSystemXmlApplicationContext and retrieve a bean.
	 */
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/spring.xml");

		PrintingMachine printingMachine = (PrintingMachine) context.getBean("printingMachine");
		printingMachine.print();
	}
}