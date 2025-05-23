package com.ohgiraffers.testapp.section04.aggregate;

import java.io.Serializable;
import java.util.Arrays;

public class Member implements Serializable {

    private int membNo; // 회원번호
    private String id;  // 회원아이디
    private String pwd; // 회원비밀번호
    private int age;    // 회원나이
    private String[] hobbies; // 회원취미들
    private BloodType bloodType;    // 회원혈액형

    public Member() {}

    public Member(int membNo, String id, String pwd, int age, String[] hobbies) {
        this.membNo = membNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.membNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public int getMembNo() {
        return membNo;
    }

    public void setMembNo(int membNo) {
        this.membNo = membNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "[" +
                "membNo=" + membNo +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                ']';
    }
}