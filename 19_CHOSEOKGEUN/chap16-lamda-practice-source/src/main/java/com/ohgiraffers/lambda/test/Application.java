package com.ohgiraffers.lambda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Application app = new Application(); // 인스턴스 생성 후 메서드 호출

        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    public void test1() {
        // 현재시각 HH:mm:ss.SSS 출력하는 람다식
        Runnable timePrinter = () -> {
            String now = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
            System.out.println(now);
        };
        timePrinter.run();
    }

    public void test2() {
        // 로또번호 생성하는 람다식 (1~45 숫자 중 6개 뽑기)
        Supplier<Set<Integer>> lottoSupplier = () -> {
            Set<Integer> lotto = new TreeSet<>();
            Random random = new Random();
            while (lotto.size() < 6) {
                lotto.add(random.nextInt(45) + 1);
            }
            return lotto;
        };
        System.out.println("lotto = " + lottoSupplier.get());
    }

    public void test3() {
        // 원화 → 달러 환산 (1달러 = 1350원)
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요: ");
        int won = sc.nextInt();

        // 람다식으로 계산
        Function<Integer, Double> toDollar = w -> w / 1350.0;
        System.out.printf("￦ %d => ＄ %f\n", won, toDollar.apply(won));
    }

    public void test4() {
        // Function 인터페이스 활용한 환율 변환
        Function<Integer, Double> convert = won -> won / 1350.0;
        System.out.printf("3000원은 ＄%f 입니다.\n", convert.apply(3000));
    }

    public void test5() {
        // 공백 제외한 문자열 길이 0인지 체크하는 람다
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");

        Predicate<String> isEmptyAfterTrim = s -> s.trim().isEmpty();

        for (String str : strList) {
            System.out.printf("[%s]의 길이는 0입니까? %s\n", str, isEmptyAfterTrim.test(str));
        }
    }
}
