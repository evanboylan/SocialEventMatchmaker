package com.example.demo;

import com.example.demo.model.Event;
import com.example.demo.model.User;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private final UserRepository userRepo;
    private final EventRepository eventRepo;

    public Populator(UserRepository userRepo, EventRepository eventRepo) {
        this.userRepo = userRepo;
        this.eventRepo = eventRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Event bonobo = new Event("Bonobo", "opener", "venue", "date","7:00pm", 7.00, "imgurl");
        Event bonobo2 = new Event("Bonobo2", "opener", "venue", "date","7:00pm", 7.00, "imgurl");

        eventRepo.save(bonobo);
        eventRepo.save(bonobo2);

        User evanTest = new User("Evan", "https://avatars.githubusercontent.com/u/65260914?s=400&u=8088e97bd077c1d562c21607a9c836d7f090a154&v=4", bonobo, bonobo2);
        User joshTest = new User ("Josh", "https://avatars.githubusercontent.com/u/55861739?v=4", bonobo2);

        userRepo.save(evanTest);
        userRepo.save(joshTest);



    }
}
