package completableFuture.demo6;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"I");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"love");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->"you");

        CompletableFuture.allOf(future1, future2, future3);

        System.out.println(future1.isDone());
        System.out.println(future2.isDone());
        System.out.println(future3.isDone());

        String result = Stream
                .of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
