package com.ohgiraffers.section02;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(20000, -30000);
    }
}
