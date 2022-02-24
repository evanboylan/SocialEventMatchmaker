package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private EventRepository eventRepo;
    private UserRepository userRepo;

    public UserController(EventRepository eventRepo, UserRepository userRepo) {
        this.eventRepo = eventRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/{id}")
    public User retrieveSingleUser(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @GetMapping("/all")
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }


}