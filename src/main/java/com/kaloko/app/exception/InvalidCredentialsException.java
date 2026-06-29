package com.kaloko.app.exception;

/**
 * Exception thrown when login fails due to incorrect credentials.
 */
public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
