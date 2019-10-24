// generics and wildcards

package com.caveofprogramming.javatutorial.p31;

import java.util.ArrayList;
import java.util.List;

class Machine {
    @Override
    public String toString() {
        return "I am a machine.";
    }

    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera.";
    }

    public void start() {
        System.out.println("Camera started.");
    }
}

public class App {
    public static void main(String[] args) {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Machine());
        machines.add(new Machine());
        showMachines(machines);

        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera());
        cameras.add(new Camera());
        showMachines(cameras);
    }

    // private static void showMachines(List<?> list) {
    //     for(Object value: list) {
    //         System.out.println(value);
    //     }
    // }

    private static void showMachines(List<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }
}
