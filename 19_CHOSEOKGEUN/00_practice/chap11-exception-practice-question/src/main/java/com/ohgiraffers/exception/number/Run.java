package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public void test() {
        Scanner sc = new Scanner(System.in);
        NumberProcess np = new NumberProcess();

        try {
            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            int a = sc.nextInt();

            System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
            int b = sc.nextInt();

            boolean result = np.checkDouble(a, b);

            if (result) {
                System.out.println(a + "는 " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는 " + b + "의 배수가 아닙니다.");
            }

        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void main(String[] args) {
        new Run().test();
    }
}
