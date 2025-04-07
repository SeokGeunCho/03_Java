package com.ohgiraffers.section02.userexception;

public class NotEnoughMoneyException extends NegativeException {



    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
