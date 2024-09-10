package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.repositories.EventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public Event findById(Long id) {

        Optional<Event> event = repository.findById(id);

        return event.get();

    }

    public Event insert(Event obj) {

        return repository.save(obj);

    }

    public void delete(Long id) {

        repository.deleteById(id);

    }

    @Transactional
    public Event update(Long id, Event obj) {

        Event event = repository.getReferenceById(id);

        updateData(event, obj);

        return repository.save(event);

    }

    private void updateData(Event event, Event obj) {

        event.setDescription(obj.getDescription());
        event.setName(obj.getName());
        event.setDate(obj.getDate());
        event.setTime(obj.getTime());

    }

}
