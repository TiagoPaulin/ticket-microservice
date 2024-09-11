package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.models.Ticket;
import com.onlycompany.ticket_microservice.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
