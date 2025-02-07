package com.mood_room.web_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class MainController {
        @GetMapping
        public String sayHello() {
            return "Hallo! Deine Spring Boot REST API funktioniert. 🚀";
        }
}
