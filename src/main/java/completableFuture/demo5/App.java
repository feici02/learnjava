package completableFuture.demo5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) {

        try {
            CompletableFuture<String> completableFuture = CompletableFuture
                    .supplyAsync(() -> "Hello, ")
                    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "world!"));
            System.out.println(completableFuture.get());

            CompletableFuture<String> completableFuture2 = CompletableFuture
                    .supplyAsync(() -> "Hello, ")
                    .thenCombine(CompletableFuture.supplyAsync(() -> "world!"),
                            (s1, s2) -> s1 + s2);
            System.out.println(completableFuture2.get());

            CompletableFuture
                    .supplyAsync(() -> "Hello, ")
                    .thenAcceptBoth(CompletableFuture.supplyAsync(() -> "world!"),
                            (s1, s2) -> System.out.println(s1 + s2));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
