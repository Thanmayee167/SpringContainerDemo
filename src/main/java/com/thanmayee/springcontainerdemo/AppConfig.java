package com.thanmayee.springcontainerdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/** Configuration class defining beans using @Bean annotation. */
@Configuration
// In AppConfig.java, we use @ComponentScan, which tells Spring to automatically scan and register
// all components (i.e., classes annotated with @Component, @Service, @Repository, etc.).
@ComponentScan("com.thanmayee.springcontainerdemo")
public class AppConfig {

}
