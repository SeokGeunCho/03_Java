/*
 * 실행용 클래스
 */

package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public void test1() { // 예외 테스트용 메서드 test1() 정의
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();

        System.out.print("문자열을 입력하세요 : ");
        String input = sc.nextLine();   // 사용자 입력 받기

        try {
            int result = cp.countAlpha(input);  // 핵심 기능 호출
            System.out.println("영문자 개수 : " + result);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage()); // 예외 발생 시 메시지 출력
        }

        sc.close();
    }

    public static void main(String[] args) {
        new Run().test1();
    }
}
