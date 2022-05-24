package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "GoodBye from Spring Boot";
    }
}
