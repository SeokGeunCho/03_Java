package com.ohgiraffers.testapp.section04.repository;


import com.ohgiraffers.testapp.section04.aggregate.Member;

import java.io.File;
import java.util.ArrayList;

// 데이터와 입출력(CRUD)을 위해 만들어지며 성공 또는 실패 여부를 반환
public class MumberRepository {

    File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

    if(!file.exists()){

        ArrayList<Member> members = new ArrayList<>();
        defaultMembers.add(new Member(1,"user01"))

    }
}
