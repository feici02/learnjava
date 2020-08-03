package com.feici02.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer, Integer> map = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toMap(n -> n, n -> n * n));

        System.out.println(map);
    }
}
