package com.caveofprogramming.javatutorial.p38;

public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public abstract void doStuff();
    public abstract void stop();

    public void run() {
        start();
        doStuff();
        stop();
    }
}
