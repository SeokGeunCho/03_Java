package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }



    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */

    private void test1() {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println("현재 시간 : "+ supplier.get());

    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */

    private void test2() {
        System.out.print("lotto = [");
        for(int i = 0; i < 6; i++) {
            IntSupplier lotto = () -> (int) (Math.random() * 45)+1;
            System.out.print(" "+lotto.getAsInt());
        }
        System.out.println(" ]");
    }


    /**
        </pre>
        @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */

    private void test3() {
        Function<Double,Double> wonToDollar = won -> won / 1350;

        double inputWon = 3000.0;
        double dollar = wonToDollar.apply(inputWon);

        System.out.println("₩ "+inputWon +" => "+"$ "+ dollar);

    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */

    private void test4() {
        Function<Double,Double> wonToDollar = won -> won / 1350;

        double inputWon = 3000.0;
        double dollar = wonToDollar.apply(inputWon);

        System.out.println(dollar);

    }


    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */

    private void test5() {


        List<String> strList = Arrays.asList("abc","","대한민국","   ");

        Predicate<String> isEmpty =  str -> str.trim().isEmpty();

        strList.forEach(str
                -> System.out.println(
                        "[" + str + "]"+ "의 길이는 0 입니까? "
                            + (isEmpty.test(str) ? "true" : "false")

        )
        );

    }



}
