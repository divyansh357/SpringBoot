package com.divyansh.SpringBoot.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
//    @Autowired
//    Cpu cpu;

    public void compile(){
            //cpu.compute();
            System.out.println("Compiling in Laptop...");
    }
}
