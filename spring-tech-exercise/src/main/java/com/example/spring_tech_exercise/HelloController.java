package com.example.spring_tech_exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // Mckabe was here
    @GetMapping("/")
    public String home() {
        return "Hello Spring Boot! My framework is working 🎉";
    }
}
//Devin was here
// Hazel was here
// Andy was here
