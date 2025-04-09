package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

// 게시글 출력 결과를 담당하는 클래스
public class ResultPrinter {

    // 게시글 전체 출력
    public void printAllList(ArrayList<BoardDTO> list) {
        if (list.isEmpty()) {
            System.out.println("게시물이 없습니다.");
        } else {
            for (BoardDTO b : list) {
                System.out.println(b);
            }
        }
    }

    // 게시글 1개 출력
    public void printBoard(BoardDTO b) {
        System.out.println(b);
    }

    // 에러 메시지 출력
    public void errorPage(String msg) {
        System.out.println("[에러] " + msg);
    }

    // 성공 메시지 출력
    public void successPage(String msg) {
        System.out.println("[성공] " + msg);
    }

    // 검색 결과 없음 출력
    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }
}
