package com.caveofprogramming.javatutorial.p35;

public class Test {
    public void run() throws ServerException {
        int code = 1;

        if (code != 0) {
            throw new ServerException("Cannot connect to server: " + code);
        }

        System.out.println("Running successfully.");
    }
}
