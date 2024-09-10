package com.onlycompany.ticket_microservice.repositories;

import com.onlycompany.ticket_microservice.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
