package com.ssafy.welog.exception.user;

public class UserDuplicateEmailException extends RuntimeException {

    public UserDuplicateEmailException(String message) {
        super(message);
    }
}
