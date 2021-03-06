package com.daitangroup.mysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserIdMissingException extends RuntimeException{
    public UserIdMissingException(String exception) {
        super(exception);
    }
}