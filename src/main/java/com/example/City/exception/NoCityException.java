package com.example.City.exception;

public class NoCityException extends Exception {

    private String message;

    public NoCityException(String message) {
        this.message = message;
    }

    public String toString() {
        return ("NoCityException Occured: " + message);
    }
}
