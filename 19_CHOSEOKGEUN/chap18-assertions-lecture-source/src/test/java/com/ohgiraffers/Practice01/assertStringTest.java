package com.ohgiraffers.Practice01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JupiterAssertionsTests {
    @Test
    @DisplayName("AssertJ 문자열 테스트")
    void assertStringTest() {
        String actual = "hello world";

        Assertions.assertThat(actual)
                .isNotEmpty()                // 비어있지 않음
                .isNotBlank()               // 공백만 있는 것이 아님
                .contains("hello")          // "hello" 포함
                .startsWith("h")            // h로 시작
                .endsWith("d")              // d로 끝남
                .isEqualTo("hello world");  // 정확히 일치
    }
}