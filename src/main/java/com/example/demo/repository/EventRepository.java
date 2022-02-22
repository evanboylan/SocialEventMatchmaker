package com.example.demo.repository;

import com.example.demo.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {


}
