package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
    @RestController
    @RequestMapping("test")
    public class HelloWorldController {
        @GetMapping("hello")
        public String sayHello() {
            return "Hello World";
        }
    }
}
