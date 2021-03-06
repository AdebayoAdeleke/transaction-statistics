package com.aadeleke.statistics.exception;

import org.springframework.http.HttpStatus;


public class TransactionException extends RuntimeException {


    private HttpStatus status;

    public TransactionException(String message){
        super(message);
    }

    public TransactionException(String message, HttpStatus status){
        super(message);
        this.status = status;
    }

    public TransactionException(String message, Throwable cause){
        super(message, cause);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
