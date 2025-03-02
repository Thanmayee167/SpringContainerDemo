package com.thanmayee.springcontainerdemo;

//@Component // not needed for manual bean creation (wrongly placed)
public class PrintingMachine {

	private int id;
	private PaperTray paperTray;

	// Constructor Injection
	public PrintingMachine(int id, PaperTray paperTray) {
		this.id = id;
		this.paperTray = paperTray;
	}

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
}
