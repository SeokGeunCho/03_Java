package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체
    private BookManager bm = new BookManager(); // 도서 목록 관리 객체(BookManager)

    public void menu() {
        while (true) { // 메뉴를 반복적으로 출력하기 위한 무한 루프
            System.out.println("\n*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt(); // 메뉴 번호 입력 받기
            sc.nextLine(); // 입력 후 남은 개행 문자 제거

            switch (choice) { // 입력한 번호에 따라 분기
                case 1 -> bm.addBook(inputBook()); // 도서 입력 후 추가
                case 2 -> {
                    System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순): ");
                    int sort = sc.nextInt(); // 정렬방식 선택
                    ArrayList<BookDTO> sorted = bm.sortedBookList(sort); // 정렬된 리스트 얻기
                    if (sort != 1 && sort != 2) {
                        System.out.println("번호를 잘못입력하였습니다.");
                    } else {
                        bm.printBookList(sorted); // 정렬 결과 출력
                    }
                }
                case 3 -> {
                    String title = inputBookTitle(); // 도서 제목 입력
                    int index = bm.searchBook(title); // 제목으로 인덱스 검색
                    if (index != -1) { // 삭제
                        bm.deleteBook(index);
                        System.out.println("성공적으로 삭제되었습니다.");
                    } else {
                        System.out.println("삭제할 도서가 존재하지 않습니다.");
                    }
                }
                case 4 -> {
                    String title = inputBookTitle();    // 도서 제목 입력
                    int index = bm.searchBook(title);   // 검색
                    if (index != -1) {
                        bm.printBook(index); // 도서 출력
                    } else {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    }
                }
                case 5 -> bm.displayAll(); // 전체 도서 출력
                case 6 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return; // while 루프 종료 → 프로그램 종료
                }
                default -> System.out.println("잘못된 번호입니다."); // 유효하지 않은 번호
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 제목: ");
        String title = sc.nextLine(); // 제목 입력
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        int category = sc.nextInt(); // 장르 선택
        sc.nextLine(); // 개행 문자 제거
        System.out.print("도서 저자: ");
        String author = sc.nextLine(); // 저자 입력
        return new BookDTO(category, title, author); // 입력값으로 BookDTO 객체 생성 후 반환
    }

    public String inputBookTitle() {
        System.out.print("도서 제목: ");
        return sc.nextLine(); // 제목 입력 후 반환
    }
}
