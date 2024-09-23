package com.example.spring_boot_sample.Greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello, Welcome to Spring Boot!";
    }
}
