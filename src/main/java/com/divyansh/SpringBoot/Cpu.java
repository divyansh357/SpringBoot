package com.divyansh.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
    public void compute(){
        System.out.println("Compute Provided...");
    }
}
