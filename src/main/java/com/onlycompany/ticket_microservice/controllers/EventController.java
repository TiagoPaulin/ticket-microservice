package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Event> findById(@PathVariable Long id) {

        Event event = service.findById(id);

        return ResponseEntity.ok().body(event);

    }

}
