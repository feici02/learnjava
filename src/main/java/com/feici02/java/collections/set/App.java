package com.feici02.java.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        testSet(set);
        testSet(set2);
        testSet(set3);
    }

    private static void testSet(Set<String> set) {
        set.add("dog");
        set.add("bear");
        set.add("elephant");
        set.add("cat");

        System.out.println("----------");
        System.out.println(set);
    }
}
