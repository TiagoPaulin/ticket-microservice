//package com.onlycompany.ticket_microservice.config;
//
//import com.onlycompany.ticket_microservice.models.Event;
//import com.onlycompany.ticket_microservice.models.EventType;
//import com.onlycompany.ticket_microservice.models.Ticket;
//import com.onlycompany.ticket_microservice.repositories.EventRepository;
//import com.onlycompany.ticket_microservice.repositories.EventTypeRepository;
//import com.onlycompany.ticket_microservice.repositories.TicketRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.Arrays;
//
//@Configuration
//@Profile("test")
//public class TestConfig implements CommandLineRunner {
//
//    @Autowired
//    TicketRepository ticketRepository;
//
//    @Autowired
//    EventRepository eventRepository;
//
//    @Autowired
//    EventTypeRepository eventTypeRepository;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//        Event event1 = new Event(null, "Festival de Música", "Um grande festival de música com bandas ao vivo.",
//                LocalDate.of(2024, 9, 20), LocalTime.of(18, 30));
//        Event event2 = new Event(null, "Conferência de Tecnologia", "Conferência sobre as últimas tendências em tecnologia.",
//                LocalDate.of(2024, 10, 5), LocalTime.of(9, 0));
//        Event event3 = new Event(null, "Exposição de Arte", "Uma exposição de arte moderna por artistas locais.",
//                LocalDate.of(2024, 11, 15), LocalTime.of(14, 0));
//
//        Ticket ticket1 = new Ticket(null, 100, 50.0f, true, false);
//        Ticket ticket2 = new Ticket(null, 200, 75.0f, false, true);
//        Ticket ticket3 = new Ticket(null, 150, 60.0f, true, true);
//
//        EventType eventType1 = new EventType(null, "Festival");
//        EventType eventType2 = new EventType(null, "Conferência");
//        EventType eventType3 = new EventType(null, "Exibição");
//
//        ticket1.setEvent(event1);
//        ticket2.setEvent(event2);
//        ticket3.setEvent(event3);
//
//        event1.setType(eventType1);
//        event2.setType(eventType2);
//        event3.setType(eventType3);
//
//        event1.getTickets().add(ticket1);
//        event2.getTickets().add(ticket2);
//        event3.getTickets().add(ticket3);
//
//        eventTypeRepository.saveAll(Arrays.asList(eventType1, eventType2, eventType3));
//        eventRepository.saveAll(Arrays.asList(event1, event2, event3));
//        ticketRepository.saveAll(Arrays.asList(ticket1, ticket2, ticket3));
//
//
//
//    }
//
//}
