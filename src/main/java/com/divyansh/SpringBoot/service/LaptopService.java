package com.divyansh.SpringBoot.service;

import com.divyansh.SpringBoot.repository.LaptopRepository;
import com.divyansh.SpringBoot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository rep;

    public void addLaptop(Laptop lap) {
        rep.save(lap);
    }

    public boolean isGoodForProgg(Laptop lap){
        return true;
    }
}
