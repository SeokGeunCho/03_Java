package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {}

    public PersonDTO(int age, double height, double weight) {}

    public String information() {
        return "이름 : " + name + ", 나이 : " + age + ", 신장 : " + height + ", 몸무게 : " + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
