// abstract class

package com.caveofprogramming.javatutorial.p38;

public class App {
    public static void main(String[] args) {
        // Machine machine = new Machine();
        Camera camera = new Camera();
        Car car = new Car();

        camera.setId(1);
        car.setId(2);

        camera.run();
        car.run();
    }
}
