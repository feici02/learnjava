package com.feici02.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "two");
        map.put(8, "eight");
        map.put(5, "five");

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
