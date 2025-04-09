package com.ohgiraffers.section02.userexception;

public class NegativeException extends Exception {
<<<<<<< HEAD
    /*
     * 사용자 정의의 예외클래스를 만들기 위해서는 Exception 클래스를 상속받으면 된다.
     * 경우에 따라서는 더 상위 타입인 Throwalbe클래스나 하위 타입의 클래스를 상속받기도 한다.
     */
=======

    /*
    * 사용자 정의의 예외클래스를 만들기 위해서는 Exception 클래스를 상속받으면 된다.
    * 경우에 따라서는 더 상위 타입인 Throwable클래스나 하위 타입의 클래스를 상속받기도한다.
    * */

>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7
    public NegativeException(String message) {
        super(message);
    }
}
