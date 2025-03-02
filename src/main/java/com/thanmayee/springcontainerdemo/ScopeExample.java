package com.thanmayee.springcontainerdemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ScopeExample {
	public static void main(String[] args) {

		PrintingMachine printingMachine;
		PrintingMachine printingMachine1;

		// BeanFactory

		Resource resource = new ClassPathResource("spring.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		printingMachine = (PrintingMachine) factory.getBean("printingMachine");
		printingMachine1 = (PrintingMachine) factory.getBean("printingMachine");

		System.out.println("Using BeanFactory (printingMachine == printingMachine1: "
				+ (printingMachine == printingMachine1) + ")"); // TRUE

		// Application context

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		printingMachine = context.getBean(PrintingMachine.class);
		printingMachine1 = context.getBean(PrintingMachine.class);

		System.out.println("Using ApplicationContext (printingMachine == printingMachine1: "
				+ (printingMachine == printingMachine1) + ")"); // TRUE

	}
}