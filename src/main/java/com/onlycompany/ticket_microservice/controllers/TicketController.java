package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    @Autowired
    TicketService service;

}
