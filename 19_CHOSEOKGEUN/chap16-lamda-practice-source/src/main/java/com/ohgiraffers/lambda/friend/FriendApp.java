package com.ohgiraffers.lamba.friend;

import com.ohgiraffers.lambda.friend.Friend;

import java.util.List;
import java.util.Map;

public class FriendApp {
    public static void main(String[] args) {

        // 친구 리스트 생성
        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        // 1. 40세 이상만 출력 (람다 사용)
        list.forEach(friend -> {
            if (friend.getAge() >= 40) {
                System.out.println(friend);
            }
        });

        // map 생성
        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );

        // 2. key가 홀수인 value만 출력
        map.forEach((key, value) -> {
            if (key % 2 != 0) {
                System.out.println(value);
            }
        });
    }
}
