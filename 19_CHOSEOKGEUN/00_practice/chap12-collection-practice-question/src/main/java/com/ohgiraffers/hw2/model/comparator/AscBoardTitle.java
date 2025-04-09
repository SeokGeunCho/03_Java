package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

// 글제목 오름차순 정렬을 위한 비교 클래스
public class AscBoardTitle implements Comparator<BoardDTO> {
    public int compare(BoardDTO b1, BoardDTO b2) {
        return b1.getBoardTitle().compareTo(b2.getBoardTitle());
    }
}
