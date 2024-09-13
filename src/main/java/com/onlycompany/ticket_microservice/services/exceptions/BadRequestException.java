package com.onlycompany.ticket_microservice.services.exceptions;

public class BadRequestException extends RuntimeException {

    public BadRequestException (String msg) {
        super(msg);

    }

}
