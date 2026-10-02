package com.divyansh.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu;
    public void compile(){
            cpu.compute();
            System.out.println("Compiler Provided...");
    }
}
