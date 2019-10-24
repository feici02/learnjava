package com.caveofprogramming.javatutorial.p38;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("car - start");
    }

    @Override
    public void doStuff() {
        System.out.println("car - doStuff");
    }

    @Override
    public void stop() {
        System.out.println("car - stop");
    }
}
