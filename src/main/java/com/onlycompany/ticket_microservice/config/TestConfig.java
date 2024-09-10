package com.onlycompany.ticket_microservice.config;

import com.onlycompany.ticket_microservice.models.Ticket;
import com.onlycompany.ticket_microservice.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void run(String... args) throws Exception {

        Ticket ticket1 = new Ticket(null, 100, 50.0f, true, false);
        Ticket ticket2 = new Ticket(null, 200, 75.0f, false, true);
        Ticket ticket3 = new Ticket(null, 150, 60.0f, true, true);

        ticketRepository.saveAll(Arrays.asList(ticket1, ticket2, ticket3));

    }
}
