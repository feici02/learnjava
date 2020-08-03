package com.feici02.java.completablefuture.demo7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) {
        // String name = "Jason!";
        String name = null;
        CompletableFuture<String> completableFuture = CompletableFuture
                .supplyAsync(() -> {
                    if (name == null) {
                        throw new RuntimeException("name should not be null");
                    }
                    return "Hello, " + name;
                });
        //.handle((s, t) -> s != null ? s : "Hello, world!");

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
