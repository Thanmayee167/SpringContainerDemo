package com.thanmayee.springcontainerdemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterInjectionExample {
    public static void main(String[] args) {
        PrintingMachine printingMachine;

        // BeanFactory

        Resource resource = new ClassPathResource("spring.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        printingMachine = (PrintingMachine) factory.getBean("printingMachine");

        System.out.println("PrintingMachine id="+printingMachine.getId()); // PrintingMachine id=101

        // Application context

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        printingMachine = context.getBean(PrintingMachine.class);

        System.out.println("PrintingMachine id="+printingMachine.getId()); // PrintingMachine id=101

    }
}
