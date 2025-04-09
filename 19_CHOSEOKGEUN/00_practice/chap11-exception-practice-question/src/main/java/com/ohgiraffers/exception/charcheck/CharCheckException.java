/*
 사용자 정의 예외 클래스
 */
package com.ohgiraffers.exception.charcheck;

public class CharCheckException extends Exception {

    // 기본 생성자로 생성
    public CharCheckException() {
        super("체크할 문자열 안에 공백 포함할 수 없습니다.");
    }

    // 기본 생성자로 생성 2
    public CharCheckException(String message) {
        super(message);
    }
}
