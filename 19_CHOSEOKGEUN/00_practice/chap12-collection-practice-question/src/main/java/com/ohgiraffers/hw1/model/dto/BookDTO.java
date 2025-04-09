package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo; // 도서 번호
    private int category; // 도서 분류 (1~4)
    private String title; // 도서 제목
    private String author; // 도서 저자

    public BookDTO() {} ; // 기본 생성자

    // 생성자: category, title, author를 받아서 객체 초기화
    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    // Getter / Setter 메서드들
    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // 객체를 문자열로 출력할 때 호출되는 메서드
    @Override
    public String toString() {
        // category 번호를 문자열로 변환
        String catStr = switch (category) {
            case 1 -> "인문";
            case 2 -> "자연과학";
            case 3 -> "의료";
            case 4 -> "기타";
            default -> "분류없음";
        };
        // 도서 정보를 보기 좋게 포맷팅해서 리턴
        return String.format("도서번호: %d, 제목: %s, 저자: %s, 분류: %s", bNo, title, author, catStr);
    }

}

