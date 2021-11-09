package com.ssafy.welog.exception.user;

public class UserDuplicateException extends RuntimeException {

    public UserDuplicateException(String message) {
        super(message);
    }
}
