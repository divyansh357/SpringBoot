package com.divyansh.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Application.class, args);
        // We created this object manually
        //Alien obj = new Alien();

        // Getting it from Spring
        // without adding the @Component - No qualifying bean of type 'com.divyansh.SpringBoot.Alien' available
        Alien obj = context.getBean(Alien.class);
        obj.code();

        // Creating one more Alien object
        Alien obj1 = context.getBean(Alien.class);
        obj1.code();
	}

}
