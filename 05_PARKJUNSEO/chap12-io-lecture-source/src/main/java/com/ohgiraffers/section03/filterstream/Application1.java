package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.nio.Buffer;

public class Application1 {

    public static void main(String[] args) {
        /*
         * java.io 패키지의 입출력 스트림은 기본스트림과 필터스트림으로 분류할 수 있다.
         * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
         * 필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는
         * 스트림이다. 주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다.
         * 생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있다.
         * */

         BufferedWriter bw = null;

        try {
            bw = new BufferedWriter (new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요.\n");
            bw.write("반갑습니다.\n");

            // bw.flush();    // 얘를 해줘야 위의 내용이 들어옴 (버퍼 공간에 있는 내용을 모두 비워줌, 그래야 내용이 들어옴)

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();     // close()는 버퍼 내용을 다 내보내고 닫는 역할도 함
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        System.out.println("================================================================");

        BufferedReader br = null;    // BufferedReader는 한 행씩 읽음

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            String temp;

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
