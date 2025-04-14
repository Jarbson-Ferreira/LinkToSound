package com.example.LinkToSound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.LinkToSound", "controller"})
public class LinkToSoundApplication {
    public static void main(String[] args) {
        SpringApplication.run(LinkToSoundApplication.class, args);
    }
}