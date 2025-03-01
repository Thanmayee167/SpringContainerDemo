# SpringContainerDemo

# Spring Container

## Overview

A **Spring Container** is responsible for managing the lifecycle and configuration of beans in a Spring application. It handles **dependency injection (DI), bean creation, initialization, and destruction** automatically.

## Types of Spring Containers

Spring provides two main types of containers:

### 1️⃣ BeanFactory (Lightweight Container)

- **Deprecated**: `XmlBeanFactory` has been removed since Spring 5.
- Use `DefaultListableBeanFactory` with `XmlBeanDefinitionReader` instead.
- **Lazy loading** (beans are created **only when needed**).
- Suitable for **lightweight applications**.

#### Example:

```java
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
```

### 2️⃣ ApplicationContext (Advanced Container)

- Uses `ClassPathXmlApplicationContext`, `FileSystemXmlApplicationContext`, or `AnnotationConfigApplicationContext`.
- **Eager loading** (beans are created **at startup**).
- Supports **AOP, event propagation, and internationalization**.

#### Example using `ClassPathXmlApplicationContext`:

```java
package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main method to initialize ApplicationContext using
 * ClassPathXmlApplicationContext and retrieve a bean.
 */
public class ClassPathXmlApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PrintingMachine printingMachine = (PrintingMachine) context.getBean("printingMachine");
        printingMachine.print();
    }
}
```

#### Example using `FileSystemXmlApplicationContext`:

```java
package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Main method to initialize ApplicationContext using
 * FileSystemXmlApplicationContext and retrieve a bean.
 */
public class FileSystemXmlApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/spring.xml");
        PrintingMachine printingMachine = (PrintingMachine) context.getBean("printingMachine");
        printingMachine.print();
    }
}
```

### 3️⃣ AnnotationConfigApplicationContext (Java-Based Configuration)

- Uses **Java annotations (****`@Configuration`****, ****`@Bean`****) instead of XML**.
- Preferred for **Spring Boot applications**.

#### Example:

```java
package com.thanmayee.springcontainerdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class defining beans using @Bean annotation.
 */
@Configuration
class AppConfig {
    @Bean
    public PrintingMachine printingMachineBean() {
        return new PrintingMachine();
    }
}

/**
 * Main method to initialize ApplicationContext and retrieve a bean.
 */
public class AnnotationConfigApplicationContextExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PrintingMachine printingMachine = context.getBean(PrintingMachine.class);
        printingMachine.print();
    }
}
```

## Choosing the Right Container

| Container Type                       | Recommended Use Case                                       |
| ------------------------------------ | ---------------------------------------------------------- |
| `XmlBeanFactory` (Removed)           | **Do not use** (Replaced by `DefaultListableBeanFactory`). |
| `ClassPathXmlApplicationContext`     | XML-based configuration.                                   |
| `FileSystemXmlApplicationContext`    | XML outside classpath.                                     |
| `AnnotationConfigApplicationContext` | Java-based configuration (**Best Practice**).              |

## Summary

- A **Spring Container** manages beans and their dependencies.
- `ApplicationContext` is **recommended** over `BeanFactory`.
- Use **Java-based configuration (****`@Configuration`****, ****`@Bean`****)** for modern applications.

---

💡 **Spring Boot users should prefer ****`@SpringBootApplication`**** for automatic configuration.** 