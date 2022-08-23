package com.example.City.exception;

public class NoCitizenException extends Exception {

    private String message;

    public NoCitizenException(String message) {
        this.message = message;
    }

    public String toString() {
        return ("NoCitizenException Occured: " + message);
    }
}
