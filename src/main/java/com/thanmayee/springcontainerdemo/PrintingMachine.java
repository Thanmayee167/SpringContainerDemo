package com.thanmayee.springcontainerdemo;

import org.springframework.stereotype.Component;

@Component
public class PrintingMachine {
	public void print() {
		System.out.println("I am prinitng");
	}
}
