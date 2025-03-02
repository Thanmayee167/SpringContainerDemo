package com.thanmayee.springcontainerdemo;

import org.springframework.stereotype.Component;

@Component("desktop")
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Code Compiled in a Desktop");
    }
}