package com.caveofprogramming.javatutorial.p38;

public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera - start");
    }

    @Override
    public void doStuff() {
        System.out.println("Camera - doStuff");
    }

    @Override
    public void stop() {
        System.out.println("Camera - stop");
    }
}
