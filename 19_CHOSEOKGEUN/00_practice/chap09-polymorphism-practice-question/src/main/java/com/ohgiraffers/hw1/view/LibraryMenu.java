package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.*;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("\n===== 메뉴 =====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print("선택 >> ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> System.out.println(lm.myInfo());
                case 2 -> selectAll();
                case 3 -> searchBook();
                case 4 -> rentBook();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 번호입니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서: " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.nextLine();
        Book[] result = lm.searchBook(keyword);

        for (Book book : result) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);

        switch (result) {
            case 0 -> System.out.println("성공적으로 대여되었습니다.");
            case 1 -> System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 -> System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
        }
    }
}
