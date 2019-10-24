package com.caveofprogramming.javatutorial.p35;

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.run();
        } catch (ServerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
