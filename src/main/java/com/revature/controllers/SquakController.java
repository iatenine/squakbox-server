package com.revature.controllers;

import com.revature.models.Squak;
import com.revature.services.SquakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SquakController {
    @Autowired
    SquakService squakService;

    @GetMapping("/")
    public List<Squak> getAllPosts(){
        return squakService.getAllSquaks();
    }

    @PostMapping("/")
    public Squak postSquak(@RequestBody Squak squak){
        return squakService.postSquak(squak.getContent());
    }
}
