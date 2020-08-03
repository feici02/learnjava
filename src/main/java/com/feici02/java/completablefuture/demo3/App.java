package com.feici02.java.completablefuture.demo3;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My task1 is done.");
        });

        CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My task2 is done.");
        }, Executors.newFixedThreadPool(2));

        System.out.println(StringUtils.repeat("-", 20));

        CompletableFuture<String> completableFuture = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println(Thread.currentThread().getName());
                    return "Hello, world!";
                });

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        CompletableFuture<String> completableFuture2 = CompletableFuture
                .supplyAsync(() -> {
                            System.out.println(Thread.currentThread().getName());
                            return "Hello, world!";
                        },
                        Executors.newCachedThreadPool());

        try {
            System.out.println(completableFuture2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
