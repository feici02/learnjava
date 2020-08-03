package com.feici02.java.generics;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    private static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        return list;
    }

    private static <T> void printList(List<T> list) {
        list
                .stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Character[] chars = {'h', 'e', 'l', 'l', 'o'};
        String[] names = {"Jason", "William", "Robert"};

        List<Character> list1 = arrayToList(chars);
        List<String> list2 = arrayToList(names);

        printList(list1);
        printList(list2);
    }
}
