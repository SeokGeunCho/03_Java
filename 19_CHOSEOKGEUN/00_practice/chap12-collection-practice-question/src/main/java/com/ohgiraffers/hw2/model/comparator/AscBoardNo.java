package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.Comparator;

// 글번호 오름차순 정렬을 위한 비교 클래스
public class AscBoardNo implements Comparator<BoardDTO> {
    public int compare(BoardDTO b1, BoardDTO b2) {
        return Integer.compare(b1.getBoardNo(), b2.getBoardNo());
    }
}