package com.example11.demo.model.exceptions;

public class EmailAlreadyExistsException extends RuntimeException{
    public EmailAlreadyExistsException(String username) {
        super(String.format("User with email: %s already exists", username));

    }
}