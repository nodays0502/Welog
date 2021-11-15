package com.ssafy.welog.exception.user;

public class NotValidRequestParamException extends RuntimeException {

    public NotValidRequestParamException(String message) {
        super(message);
    }
}
