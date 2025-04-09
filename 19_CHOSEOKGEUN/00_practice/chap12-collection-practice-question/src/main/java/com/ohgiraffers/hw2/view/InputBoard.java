package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

// 사용자로부터 게시글 입력을 받는 클래스
public class InputBoard {
    private Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner

    // 게시글 등록을 위한 입력 메서드
    public BoardDTO inputBoard() {
        System.out.print("제목: ");
        String title = sc.nextLine();

        System.out.print("작성자: ");
        String writer = sc.nextLine();

        System.out.println("내용 입력 (입력 종료: exit):");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line)) break; // 'exit' 입력 시 종료
            content.append(line).append("\n"); // 줄바꿈 포함하여 내용 추가
        }

        // 글번호는 0, 조회수는 0, 날짜는 현재 날짜로 설정하여 BoardDTO 생성
        return new BoardDTO(0, title, writer, new Date(), content.toString(), 0);
    }

    // 게시글 번호 입력
    public int inputBoardNo() {
        System.out.print("게시글 번호 입력: ");
        return sc.nextInt();
    }

    // 게시글 제목 입력
    public String inputBoardTitle() {
        System.out.print("수정할 제목 입력: ");
        return sc.nextLine();
    }

    // 게시글 내용 입력
    public String inputBoardContent() {
        System.out.print("수정할 내용 입력: ");
        return sc.nextLine();
    }
}