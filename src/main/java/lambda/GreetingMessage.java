package lambda;

@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}
