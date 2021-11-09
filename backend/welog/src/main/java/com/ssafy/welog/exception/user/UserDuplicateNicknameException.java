package com.ssafy.welog.exception.user;

public class UserDuplicateNicknameException extends RuntimeException {

    public UserDuplicateNicknameException(String message) {
        super(message);
    }
}
