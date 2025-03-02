package com.thanmayee.springcontainerdemo;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer {
	public void compile() {
		System.out.println("Code Compiled in a Laptop");
	}
}