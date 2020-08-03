package com.feici02.java.methodreference;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);

        Shape sh = new Shape() {
            @Override
            public void getArea() {
                System.out.println("my are is 0.");
            }
        };

        sh.getArea();
    }
}
