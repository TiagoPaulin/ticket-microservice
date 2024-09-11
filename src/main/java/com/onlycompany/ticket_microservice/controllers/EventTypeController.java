package com.onlycompany.ticket_microservice.controllers;

import com.onlycompany.ticket_microservice.services.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/type")
public class EventTypeController {

    @Autowired
    EventTypeService service;

}
