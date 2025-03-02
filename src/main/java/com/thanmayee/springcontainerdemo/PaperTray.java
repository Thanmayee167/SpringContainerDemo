package com.thanmayee.springcontainerdemo;

import org.springframework.stereotype.Component;

@Component
public class PaperTray {
	private int capacity;

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void showCapacity() {
		System.out.println("PaperTray Capacity: " + capacity + " sheets.");
	}
}
