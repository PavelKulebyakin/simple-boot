package com.spring.practice.simpleboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
