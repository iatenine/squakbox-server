package com.revature.controllers;

import com.revature.models.Squak;
import com.revature.services.SquakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
