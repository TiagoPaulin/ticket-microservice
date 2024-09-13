package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<Event> insert (@RequestBody Event obj) {

        obj = service.insert(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(obj);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Event> update (@PathVariable Long id, @RequestBody Event obj) {

        obj = service.update(id, obj);

        return ResponseEntity.ok().body(obj);

    }

}
