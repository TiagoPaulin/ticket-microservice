package com.onlycompany.ticket_microservice.repositories;

import com.onlycompany.ticket_microservice.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    
}
