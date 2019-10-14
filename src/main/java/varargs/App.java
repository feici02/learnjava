package varargs;

public class App {
    private static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return  sum;
    }

    public static void main(String[] args) {
        int result = add(1, 2);
        int result2 = add(1, 2, 3);

        System.out.println(result);
        System.out.println(result2);
    }
}
