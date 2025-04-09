package com.ohgiraffers.section01.exception;

public class Application2 {
<<<<<<< HEAD
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(10000, 50000);
            System.out.println("========== 상품 구입 가능 ==========");
        } catch (Exception e) {
            System.out.println("========== 상품 구입 불가 ==========");
        }
=======

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(10000, 50000);

            System.out.println("=========== 상품 구입 가능 ================");
        } catch (Exception e) {
            System.out.println("=========== 상품 구입 불가 =================");
        }

>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7
        System.out.println("프로그램을 종료합니다.");
    }
}
