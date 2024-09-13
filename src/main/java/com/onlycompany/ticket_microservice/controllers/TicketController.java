package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.models.Ticket;
import com.onlycompany.ticket_microservice.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    TicketService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Ticket> findById(@PathVariable Long id) {

        Ticket ticket = service.findById(id);

        return ResponseEntity.ok().body(ticket);

    }

    @PostMapping
    public ResponseEntity<Ticket> insert (@RequestBody Ticket obj) {

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
    public ResponseEntity<Ticket> update (@PathVariable Long id, @RequestBody Ticket obj) {

        obj = service.update(id, obj);

        return ResponseEntity.ok().body(obj);

    }

}
