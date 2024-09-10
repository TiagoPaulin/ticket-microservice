package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

}
