package com.thanmayee.springcontainerdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class defining beans using @Bean annotation.
 */
@Configuration
public class AppConfig {

	@Bean
	public PaperTray paperTray() {
		PaperTray tray = new PaperTray();
		tray.setCapacity(250); // Setter Injection
		return tray;
	}

	@Bean
	public PrintingMachine printingMachine() {
		PrintingMachine machine = new PrintingMachine();
		machine.setId(101);
		machine.setPaperTray(paperTray()); // Injecting PaperTray
		machine.setComputer(laptop());
		return machine;

		// return new PrintingMachine(101, paperTray());
	}

	@Bean
	public Laptop laptop() {
		return new Laptop();
	}

	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
