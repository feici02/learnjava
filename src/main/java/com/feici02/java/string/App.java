package com.feici02.java.string;

public class App {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        String message = new String(chars);
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.charAt(0));
    }
}
