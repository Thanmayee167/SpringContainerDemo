package com.thanmayee.springcontainerdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configuration class defining beans using @Bean annotation.
 */
@Configuration
class AppConfig {
	@Bean
	@Scope("prototype")
	public PrintingMachine printingMachineBean() {
		PrintingMachine printingMachine = new PrintingMachine();
		printingMachine.setId(101);
		return printingMachine;
	}
}