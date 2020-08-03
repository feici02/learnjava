package com.feici02.java.methodreference;

public class Square {
    int sideLenghth;

    Square(int sideLenghth) {
        this.sideLenghth = sideLenghth;
    }

    public int calculateArea() {
        return sideLenghth * sideLenghth;
    }
}
