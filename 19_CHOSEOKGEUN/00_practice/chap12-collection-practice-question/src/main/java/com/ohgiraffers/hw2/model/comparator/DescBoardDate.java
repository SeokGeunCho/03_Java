package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

// 작성일 내림차순 정렬을 위한 비교 클래스
public class DescBoardDate implements Comparator<BoardDTO> {
    public int compare(BoardDTO b1, BoardDTO b2) {
        return b2.getBoardDate().compareTo(b1.getBoardDate());
    }
}