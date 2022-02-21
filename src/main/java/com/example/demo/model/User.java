package com.example.demo.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String imageUrl;

    @ManyToMany
    private Collection<Event> events;

    public User(String name, String imageUrl, Event... event) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.events = Arrays.asList(event);
    }
}
