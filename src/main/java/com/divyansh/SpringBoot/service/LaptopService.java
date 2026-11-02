package com.divyansh.SpringBoot.service;

import com.divyansh.SpringBoot.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop lap) {
        System.out.println("method called");
    }

    public boolean isGoodForProgg(Laptop lap){
        return true;
    }
}
