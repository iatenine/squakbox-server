package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquakController {

    @GetMapping("/")
    public String getAllPosts(){
        return "Hello from SquakBox with failing tests";
    }
}
