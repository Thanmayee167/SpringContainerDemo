package com.thanmayee.springcontainerdemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Main method to initialize BeanFactory and retrieve a bean.
 */
public class BeanFactoryExample {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		PrintingMachine printingMachine = (PrintingMachine) factory.getBean("printingMachine");
		printingMachine.print();
	}
}
