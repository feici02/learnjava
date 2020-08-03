package com.feici02.java.bifunction.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BiFunction<
                List<Integer>,
                Predicate<Integer>,
                List<Integer>
                > filter = (l, p) -> {
            List<Integer> result = new ArrayList<>();

            for (Integer element : l) {
                if (p.test(element))
                    result.add(element);
            }

            return result;
        };

        System.out.println(
                filter.apply(
                        numbers,
                        x -> x % 2 != 0
                )
        );
    }
}
