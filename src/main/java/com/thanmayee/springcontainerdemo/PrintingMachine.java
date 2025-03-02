package com.thanmayee.springcontainerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // for autowire scenario in application context we need this
public class PrintingMachine {

	private int id;
	private PaperTray paperTray;
	private Computer computer;

	// Constructor Injection
//	public PrintingMachine(int id, PaperTray paperTray) {
//		this.id = id;
//		this.paperTray = paperTray;
//	}

	public void print() {
		System.out.println("I am prinitng");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PaperTray getPaperTray() {
		return paperTray;
	}

	public void setPaperTray(PaperTray paperTray) {
		this.paperTray = paperTray;
	}

	public Computer getComputer() {
		return computer;
	}

	@Autowired
	@Qualifier("laptop")
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
