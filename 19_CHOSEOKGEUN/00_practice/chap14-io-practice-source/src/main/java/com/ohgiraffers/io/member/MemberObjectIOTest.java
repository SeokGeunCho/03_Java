package com.ohgiraffers.io.member;

public class MemberObjectIOTest {

    public static void main(String[] args) {

        MemberManager memberManager = new MemberManager();

        // 1. 기존 파일에서 회원 읽어오기
        memberManager.readMembers();

        // 2. 새 회원 추가
        Member member = new Member("user04", "1234", "신사임당", "sinsa@sh.org", 300, '여', 9000.0);
        memberManager.addMember(member);

        // 3. 다시 전체 회원 출력
        memberManager.readMembers();
    }
}
