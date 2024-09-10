package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event findById(Long id) {

        Optional<Event> event = repository.findById(id);

        return event.get();

    }

}
