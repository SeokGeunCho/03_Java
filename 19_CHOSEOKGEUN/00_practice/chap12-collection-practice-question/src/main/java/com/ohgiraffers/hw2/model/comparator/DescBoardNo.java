package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

// 글번호 내림차순 정렬을 위한 비교 클래스
public class DescBoardNo implements Comparator<BoardDTO> {
    public int compare(BoardDTO b1, BoardDTO b2) {
        return Integer.compare(b2.getBoardNo(), b1.getBoardNo());
    }
}