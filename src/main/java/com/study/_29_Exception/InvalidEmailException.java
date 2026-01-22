package com.study._29_Exception;

// 비즈니스예외
public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message, String email) {
        super(message + ": " + email);
    }
}
