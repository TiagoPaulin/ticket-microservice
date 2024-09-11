package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.models.EventType;
import com.onlycompany.ticket_microservice.services.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/type")
public class EventTypeController {

    @Autowired
    EventTypeService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<EventType> findById(@PathVariable Long id) {

        EventType type = service.findById(id);

        return ResponseEntity.ok().body(type);

    }

    @PostMapping
    public ResponseEntity<EventType> insert (@RequestBody EventType obj) {

        obj = service.insert(obj);

        return ResponseEntity.ok().body(obj);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<EventType> update (@PathVariable Long id, @RequestBody EventType obj) {

        obj = service.update(id, obj);

        return ResponseEntity.ok().body(obj);

    }

}
