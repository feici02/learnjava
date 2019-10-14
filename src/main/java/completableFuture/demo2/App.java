package completableFuture.demo2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture
                .completedFuture("Hello, world!");

        String result = null;
        try {
            result = completableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
