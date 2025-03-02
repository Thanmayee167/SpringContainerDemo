package com.thanmayee.springcontainerdemo;

import org.springframework.stereotype.Component;

//@Component // not needed for manual bean creation (wrongly placed)
public class PrintingMachine {
	public void print() {
		System.out.println("I am prinitng");
	}
}
