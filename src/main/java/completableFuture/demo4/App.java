package completableFuture.demo4;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture
                .supplyAsync(() -> "Hello, ")
                .thenApply(s -> s + "world!");

        try {
            String message = completableFuture.get();
            System.out.println(message);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(StringUtils.repeat("-", 20));

        CompletableFuture
                .supplyAsync(() -> "Hello, ")
                .thenAccept(s -> System.out.println(s + "world!"));


        System.out.println(StringUtils.repeat("-", 20));

        CompletableFuture
                .supplyAsync(() -> "Hello, world")
                .thenRun(() -> System.out.println("Done"));
    }
}
