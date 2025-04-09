package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

    private ArrayList<BookDTO> bookList; // 도서 정보를 저장할 리스트

    public BookManager() {
        bookList = new ArrayList<>(); // ArrayList 객체 생성
    }

    public void addBook(BookDTO book) {
        book.setbNo(bookList.size() + 1); // 자동으로 도서번호 설정
        bookList.add(book);               // 리스트에 도서 추가
    }

    public void deleteBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index); // 해당 인덱스의 도서 삭제
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            // 제목이 일치하면 해당 인덱스를 리턴
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;  // 못 찾으면 -1 리턴
    }

    public void printBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index));    // 해당 인덱스 도서 출력
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");    // 도서가 없을 때
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);   // 전체 도서 출력
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);  // 복사본 생성
        if (select == 1) {
            sortedList.sort(new AscCategory()); // 오름차순 정렬
        } else if (select == 2) {
            sortedList.sort(new DescCategory()); // 내림차순 정렬
        }
        return sortedList; // 정렬된 리스트 리턴
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book); // 향상된 for문으로 출력
        }
    }
}
