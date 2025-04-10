package com.ohgiraffers.section04;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // 상속받은 메서드
        d.bark(); // 자식 클래스 고유 메서드
    }
}
// 해설:
// Animal 클래스를 Dog 클래스가 상속받음
// Dog 클래스는 sound() 메서드를 상속받아 사용할 수 있고,
// 자신만의 bark() 메서드도 가지고 있음