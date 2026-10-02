package com.divyansh.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // Autowired in SpringBoot - is used to have object access outside the main function in Application class
    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
        System.out.println("Coding...");
    }
}
