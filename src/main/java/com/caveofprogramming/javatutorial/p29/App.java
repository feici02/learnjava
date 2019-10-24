package com.caveofprogramming.javatutorial.p29;

class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Camera snapped.");
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Camera camera = new Camera();

        machine.start();
        camera.start();
        camera.snap();

        Machine machine2 = camera;
        machine2.start();
        // machine2.snap();

        // Camera camera2 = (Camera) machine;
    }
}
