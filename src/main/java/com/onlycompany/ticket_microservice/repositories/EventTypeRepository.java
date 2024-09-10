package com.onlycompany.ticket_microservice.repositories;

import com.onlycompany.ticket_microservice.models.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType, Long> {
    
}
