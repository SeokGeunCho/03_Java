package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

// 메인 메뉴와 정렬 서브 메뉴를 담당하는 클래스
public class BoardMenu {
    private BoardManager bm = new BoardManager(); // 게시글 관리 객체
    private InputBoard ib = new InputBoard();     // 입력 도우미 객체
    private Scanner sc = new Scanner(System.in);  // 사용자 입력용 스캐너

    // 게시글 관리 프로그램의 메인 메뉴
    public void mainMenu() {
        while (true) {
            System.out.println("\n*** 게시글 서비스 프로그램 ***");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체 보기");
            System.out.println("3. 게시글 한 개 보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // 개행 제거

            switch (choice) {
                case 1 -> bm.insertBoard(ib.inputBoard());
                case 2 -> bm.selectAllList();
                case 3 -> bm.selectOneBoard(ib.inputBoardNo());
                case 4 -> bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
                case 5 -> bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent());
                case 6 -> bm.deleteBoard(ib.inputBoardNo());
                case 7 -> bm.searchBoard(ib.inputBoardTitle());
                case 8 -> sortSubMenu();
                case 9 -> {
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                }
                default -> System.out.println("잘못된 번호입니다.");
            }
        }
    }

    // 정렬 기능을 제공하는 서브 메뉴
    public void sortSubMenu() {
        System.out.println("\n***** 게시글 정렬 메뉴 *****");
        System.out.println("1. 글번호순 오름차순");
        System.out.println("2. 글번호순 내림차순");
        System.out.println("3. 작성날짜순 오름차순");
        System.out.println("4. 작성날짜순 내림차순");
        System.out.println("5. 글제목순 오름차순");
        System.out.println("6. 글제목순 내림차순");
        System.out.println("7. 메인메뉴로");
        System.out.print("선택: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> bm.sortList(new AscBoardNo());
            case 2 -> bm.sortList(new DescBoardNo());
            case 3 -> bm.sortList(new AscBoardDate());
            case 4 -> bm.sortList(new DescBoardDate());
            case 5 -> bm.sortList(new AscBoardTitle());
            case 6 -> bm.sortList(new DescBoardTitle());
            case 7 -> mainMenu();
            default -> System.out.println("잘못된 번호입니다.");
        }
    }
}
