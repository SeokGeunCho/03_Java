package com.ohgiraffers.hw2.model.dto;

import java.util.Date;

// 게시글 정보를 담는 클래스
public class BoardDTO {
    private int boardNo;           // 글 번호
    private String boardTitle;     // 글 제목
    private String boardWriter;    // 작성자
    private Date boardDate;        // 작성일자
    private String boardContent;   // 글 내용
    private int readCount;         // 조회수

    public BoardDTO() {}

    // 모든 필드를 매개변수로 받는 생성자
    public BoardDTO(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent, int readCount) {
        this.boardNo = boardNo;
        this.boardTitle = boardTitle;
        this.boardWriter = boardWriter;
        this.boardDate = boardDate;
        this.boardContent = boardContent;
        this.readCount = readCount;
    }

    // 각 필드의 getter/setter
    public int getBoardNo() { return boardNo; }
    public void setBoardNo(int boardNo) { this.boardNo = boardNo; }

    public String getBoardTitle() { return boardTitle; }
    public void setBoardTitle(String boardTitle) { this.boardTitle = boardTitle; }

    public String getBoardWriter() { return boardWriter; }
    public void setBoardWriter(String boardWriter) { this.boardWriter = boardWriter; }

    public Date getBoardDate() { return boardDate; }
    public void setBoardDate(Date boardDate) { this.boardDate = boardDate; }

    public String getBoardContent() { return boardContent; }
    public void setBoardContent(String boardContent) { this.boardContent = boardContent; }

    public int getReadCount() { return readCount; }
    public void setReadCount(int readCount) { this.readCount = readCount; }

    // 게시글의 전체 내용을 보기 좋게 문자열로 반환
    @Override
    public String toString() {
        return String.format("번호: %d | 제목: %s | 작성자: %s | 날짜: %s | 조회수: %d\n내용: %s",
                boardNo, boardTitle, boardWriter, boardDate, readCount, boardContent);
    }
}

