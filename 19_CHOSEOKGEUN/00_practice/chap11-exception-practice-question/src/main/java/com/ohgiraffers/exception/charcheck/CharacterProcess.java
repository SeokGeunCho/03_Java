/*
  문자열 검사 기능을 담당하는 클래스
 */

package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {} // 기본 생성자

    /*** 문자열 s 중에서 알파벳 수를 리턴하는 메소드
     * @param s
     * @return
     * @throws CharCheckException
     * */

    public int countAlpha(String s) throws CharCheckException { // 예외처리
        if (s.contains(" ")) {
            throw new CharCheckException(); // 공백이 있으면 예외를 강제 발생 (throw)
        }

        int count = 0; // 영문자 개수를 셀 변수 초기화
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;  // 영문자일 경우만 카운트
            }
        }
        return count;
    }
}
