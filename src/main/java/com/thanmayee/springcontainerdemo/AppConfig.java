package com.thanmayee.springcontainerdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** Configuration class defining beans using @Bean annotation. */
@Configuration
// In AppConfig.java, we use @ComponentScan, which tells Spring to automatically scan and register
// all components (i.e., classes annotated with @Component, @Service, @Repository, etc.).
@ComponentScan("com.thanmayee.springcontainerdemo")
public class AppConfig {

  @Bean
  public PaperTray paperTray() {
    PaperTray tray = new PaperTray();
    tray.setCapacity(250); // Setter Injection
    return tray;
  }

  @Bean
  public PrintingMachine
      printingMachine() {
    PrintingMachine machine = new PrintingMachine();
    machine.setId(101);
    machine.setPaperTray(paperTray()); // Injecting PaperTray
    return machine;

    // return new PrintingMachine(101, paperTray());
  }
}
