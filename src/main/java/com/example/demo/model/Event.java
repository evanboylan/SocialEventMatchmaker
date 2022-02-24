package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String headliner;
    private String opener;
    private String venue;
    private String eventDate;
    private String eventTime;
    private double cost;
    private String imageUrl;

    @ManyToMany(mappedBy = "events")
    @JsonIgnore
    private Collection<User> users;

    public Event(String headliner, String opener, String venue, String eventDate, String eventTime, double cost, String imageUrl, User... user) {
        this.headliner = headliner;
        this.opener = opener;
        this.venue = venue;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.cost = cost;
        this.imageUrl = imageUrl;
        this.users = Arrays.asList(user);
    }

    public Event (){
        //zero arg constructor
    }

    public Long getId() {
        return id;
    }

    public String getHeadliner() {
        return headliner;
    }

    public String getOpener() {
        return opener;
    }

    public String getVenue() {
        return venue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public double getCost() {
        return cost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Collection<User> getUsers() {
        return users;
    }
}
