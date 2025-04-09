// 📦 com.ohgiraffers.hw2.controller
package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

// 게시글 목록을 관리하는 클래스
public class BoardManager {
    private ArrayList<BoardDTO> boardList = new ArrayList<>(); // 게시글 저장용 리스트
    private ResultPrinter rp = new ResultPrinter(); // 결과 출력용 객체

    // 게시글 추가 메서드
    public void insertBoard(BoardDTO b) {
        int no = boardList.isEmpty() ? 1 : boardList.get(boardList.size() - 1).getBoardNo() + 1; // 새 글 번호
        b.setBoardNo(no); // 글 번호 지정
        boardList.add(b); // 리스트에 추가
        rp.successPage("게시글 등록 성공!");
    }

    // 전체 게시글 출력
    public void selectAllList() {
        rp.printAllList(boardList);
    }

    // 글 번호로 특정 게시글 조회
    public void selectOneBoard(int boardNo) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setReadCount(b.getReadCount() + 1); // 조회수 증가
                rp.printBoard(b);
                return;
            }
        }
        rp.errorPage("조회된 글이 없습니다.");
    }

    // 글 제목 수정
    public void updateBoardTitle(int boardNo, String title) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTitle(title);
                rp.successPage("게시글 제목 수정 성공!");
                return;
            }
        }
        rp.errorPage("게시물 제목 수정 실패!");
    }

    // 글 내용 수정
    public void updateBoardContent(int boardNo, String content) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
                rp.successPage("게시글 내용 수정 성공!");
                return;
            }
        }
        rp.errorPage("게시글 내용 수정 실패!");
    }

    // 게시글 삭제
    public void deleteBoard(int boardNo) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
                rp.successPage("게시글 삭제 성공!");
                return;
            }
        }
        rp.errorPage("게시글 삭제 실패!");
    }

    // 제목 포함 검색
    public void searchBoard(String title) {
        ArrayList<BoardDTO> result = new ArrayList<>();
        for (BoardDTO b : boardList) {
            if (b.getBoardTitle().contains(title)) {
                result.add(b);
            }
        }
        if (result.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(result);
        }
    }

    // 정렬 후 전체 출력
    public void sortList(Comparator<BoardDTO> c) {
        boardList.sort(c);
        rp.printAllList(boardList);
    }
}