// anonymous class

package com.caveofprogramming.javatutorial.p32;

class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

interface Plant {
    public void grow();
}

public class App {
    public static void main(String[] args) {
        // a sub-class of Machine
        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera starting.");
            }
        };
        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing.");
            }
        };
        plant1.grow();
    }
}
