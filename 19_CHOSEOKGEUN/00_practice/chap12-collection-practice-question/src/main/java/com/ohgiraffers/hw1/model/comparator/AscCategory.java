package com.ohgiraffers.hw1.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.Comparator;

// BookDTO 객체를 카테고리 기준으로 오름차순 정렬하기 위한 클래스
public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        // category 값 기준으로 오름차순 비교
        return Integer.compare(o1.getCategory(), o2.getCategory());
    }
}
