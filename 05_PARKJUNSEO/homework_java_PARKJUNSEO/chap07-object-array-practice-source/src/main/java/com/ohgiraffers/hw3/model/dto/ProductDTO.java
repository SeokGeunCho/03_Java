package com.ohgiraffers.hw3.model.dto;

import com.ohgiraffers.hw3.controller.ProductController;

import static com.ohgiraffers.hw3.controller.ProductController.count;

public class ProductDTO {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    ProductController pc = new ProductController();

    public ProductDTO() {};


    public ProductDTO(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return  "제품번호 : " + pId +
                ", 제품명 : " + pName +
                ", 제품 가격 : " + price +
                ", 제품 세금 : " + tax ;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public ProductController getPc() {
        return pc;
    }

    public void setPc(ProductController pc) {
        this.pc = pc;
    }
}
