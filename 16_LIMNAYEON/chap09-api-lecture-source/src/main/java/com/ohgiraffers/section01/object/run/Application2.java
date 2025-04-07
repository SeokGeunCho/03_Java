package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;
import org.w3c.dom.ls.LSOutput;

public class Application2 {


    public static void main(String[] args) {

        /*
         * object클래스의 equals()메소드
         * equals 메소드는 매소드로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
         * 즉, 동일한 인스턴스인지를 비교하는 기능을 한다.
         * */

        /*
         * 동일객체와 동등객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         * 해쉬코드 사용: 동등객체를 동일객체로 바꾼다
         * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode = " + book1.hashCode());
        System.out.println("book2.hashCode = " + book2.hashCode());

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 연산 비교 : " + (book1.equals(book2)));
    }
}

