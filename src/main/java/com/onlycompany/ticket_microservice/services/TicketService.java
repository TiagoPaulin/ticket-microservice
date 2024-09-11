package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.models.Ticket;
import com.onlycompany.ticket_microservice.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketRepository repository;

    public Ticket findById(Long id) {

        Optional<Ticket> ticket = repository.findById(id);

        return ticket.get();

    }

    public Ticket insert(Ticket obj) {

        return repository.save(obj);

    }

    public void delete(Long id) {

        repository.deleteById(id);

    }

}
