package com.onlycompany.ticket_microservice.services;

import com.onlycompany.ticket_microservice.models.Event;
import com.onlycompany.ticket_microservice.models.EventType;
import com.onlycompany.ticket_microservice.repositories.EventTypeRepository;
import com.onlycompany.ticket_microservice.services.exceptions.BadRequestException;
import com.onlycompany.ticket_microservice.services.exceptions.ResourceNotFoundException;
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

        return type.orElseThrow(() -> new ResourceNotFoundException(id));

    }

    public EventType insert(EventType obj) {

        validateEventType(obj);

        return repository.save(obj);

    }

    public void delete(Long id) {

        if (!repository.existsById(id)) {

            throw new ResourceNotFoundException(id);

        }

        repository.deleteById(id);

    }

    @Transactional
    public EventType update(Long id, EventType obj) {

        if (!repository.existsById(id)) {

            throw new ResourceNotFoundException(id);

        }

        EventType type = repository.getReferenceById(id);

        updateData(type, obj);

        return repository.save(type);

    }

    private void updateData(EventType type, EventType obj) {

        type.setDescription(obj.getDescription());

    }

    private void validateEventType(EventType obj) {

        if (isNullOrEmptyOrBlank(obj.getDescription())) {

            throw new BadRequestException("Field is required");

        }



    }

    private boolean isNullOrEmptyOrBlank(String value) {

        return value == null || value.trim().isEmpty();

    }

}
