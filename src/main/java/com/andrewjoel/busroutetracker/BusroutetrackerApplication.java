package com.andrewjoel.busroutetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.andrewjoel.busroutetracker.core.*")
public class BusroutetrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusroutetrackerApplication.class, args);
    }

}
