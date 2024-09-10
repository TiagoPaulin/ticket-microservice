package com.onlycompany.ticket_microservice.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_event_type")
public class EventType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public EventType() {}

    public EventType(Long id, String description) {

        this.id = id;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventType eventType = (EventType) o;
        return Objects.equals(id, eventType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
