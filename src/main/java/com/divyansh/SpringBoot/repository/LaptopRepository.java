package com.divyansh.SpringBoot.repository;

import com.divyansh.SpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop Object Saved...");
    }
}
