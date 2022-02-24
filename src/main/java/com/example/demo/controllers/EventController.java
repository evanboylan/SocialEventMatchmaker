package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

    private UserRepository userRepo;

    public EventController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

//
//    @RequestMapping("/")
//    public String getHome() {
//        return "index";
//    }
}
