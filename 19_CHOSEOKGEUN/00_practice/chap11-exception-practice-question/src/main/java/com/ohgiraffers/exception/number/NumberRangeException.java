package com.ohgiraffers.exception.number;

public class NumberRangeException extends Exception {

    public NumberRangeException() {
        super("1부터 100사이의 값이 아닙니다.");
    }

    public NumberRangeException(String message) {
        super(message);
    }
}
