package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {
        /*
        * FileOutputStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
        * 1바이트 단위로 데이처를 처리한다.
         */

        FileOutputStream fout = null;

        try {
            // OutputStrem의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            int b = 0;
            fout.write (97);
            // 10 개형 문자
            byte[] barr = new byte[]{98, 99, 100, 101, 102, 10, 103};
            fout.write (barr);
            fout.write (barr, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
