package com.thanmayee.springcontainerdemo;

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