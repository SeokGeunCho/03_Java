package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {
<<<<<<< HEAD
=======

>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7
        /*
        * FileOutputStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
        * 1바이트 단위로 데이처를 처리한다.
<<<<<<< HEAD
         */
=======
        * */
>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7

        FileOutputStream fout = null;

        try {
<<<<<<< HEAD
            // OutputStrem의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            int b = 0;
            fout.write (97);
            // 10 개형 문자
            byte[] barr = new byte[]{98, 99, 100, 101, 102, 10, 103};
            fout.write (barr);
            fout.write (barr, 1, 3);
=======
            // OutputStream의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.

            // 두번째 인자로 true를 전달하면 이어쓰기가 된다.
            // false는 이어쓰기가 아닌 덮어쓰기이며 기본값은 false이다.
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            fout.write(97);
            // 10: 개행문자
            byte[] barr = new byte[]{98, 99, 100, 101, 102, 10, 103};
            fout.write(barr);

            fout.write(barr,1, 3);
>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
<<<<<<< HEAD
            if (fout != null) {
=======
            if(fout != null) {
>>>>>>> 8fd74888d272c5ced308c33effab1c9ef54e64d7
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
