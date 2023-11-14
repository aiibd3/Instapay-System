package com.softarch.phase2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phase1 {

    public static void main(String[] args) {
        Startup s1 = new Startup();
        //this will initialize the users
        s1.InitializeUsers();
        SpringApplication.run(Phase1.class, args);
    }
}
