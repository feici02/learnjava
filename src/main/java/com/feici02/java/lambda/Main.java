package com.feici02.java.lambda;

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.printf("Hello, %s!", name);
            }
        };
        gm.greet("Jason");

        GreetingMessage gm2 = (name) -> System.out.printf("Hello, %s!", name);
        gm2.greet("Jason");
    }
}
