package com.stackroute.exception;

public class MovieAlreadyExistsException extends RuntimeException{
    public MovieAlreadyExistsException(String message){
        super(message);
    }
}