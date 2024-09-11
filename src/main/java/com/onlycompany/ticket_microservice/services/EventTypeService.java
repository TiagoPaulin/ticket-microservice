package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.models.EventType;
import com.onlycompany.ticket_microservice.repositories.EventTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventTypeService {

    @Autowired
    EventTypeRepository repository;

    public EventType findById(Long id) {

        Optional<EventType> type = repository.findById(id);

        return type.get();

    }

    public EventType insert(EventType obj) {

        return repository.save(obj);

    }

    public void delete(Long id) {

        repository.deleteById(id);

    }

    @Transactional
    public EventType update(Long id, EventType obj) {

        EventType type = repository.getReferenceById(id);

        updateData(type, obj);

        return repository.save(type);

    }

    private void updateData(EventType type, EventType obj) {

        type.setDescription(obj.getDescription());

    }

}
