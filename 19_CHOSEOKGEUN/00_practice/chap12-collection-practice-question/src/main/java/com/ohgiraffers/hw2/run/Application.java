package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.view.BoardMenu;

// 프로그램의 진입점 클래스
public class Application {

    // main 메서드: 프로그램 시작점
    public static void main(String[] args) {
        new BoardMenu().mainMenu(); // BoardMenu 객체 생성 후 메인 메뉴 실행
    }
}

