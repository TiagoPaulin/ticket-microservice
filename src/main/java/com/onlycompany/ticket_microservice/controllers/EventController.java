package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    private EventService service;

}
