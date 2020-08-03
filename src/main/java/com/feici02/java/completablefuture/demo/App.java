package com.feici02.java.completablefuture.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CompletableFuture<String> completableFuture = calculateAsync();

        try {
            String result = completableFuture.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static CompletableFuture<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors
                .newCachedThreadPool()
                .submit(() -> {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(100);
                        completableFuture.complete("Hello, world!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        return completableFuture;
    }
}
