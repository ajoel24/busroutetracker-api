package com.andrewjoel.busroutetracker.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.andrewjoel.busroutetracker.core.*", exclude = {HibernateJpaAutoConfiguration.class})
public class BusroutetrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusroutetrackerApplication.class, args);
    }

}
