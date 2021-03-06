package com.example11.demo.model.exceptions;

public class InvalidUsernameOrPasswordException extends RuntimeException {

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public InvalidUsernameOrPasswordException() {
        super("The username box cannot be empty\n" +
                "Password is required");
    }
}

