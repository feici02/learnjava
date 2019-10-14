package bifunction.demo2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> biFunction = (role, age) -> getSalaryByRoleAndAge(role, age);
        Function<Integer, String> function = salary -> getBandBySalary(salary);

        String result = null;

        result = biFunction.andThen(function).apply("Manager", 31);
        System.out.println(result);

        result = biFunction.andThen(function).apply("Developer", 28);
        System.out.println(result);
    }

    private static String getBandBySalary(Integer salary) {
        if (salary >= 100000) {
            return "Band 5";
        } else if (salary > 80000) {
            return "Band 4";
        } else {
            return "Band 3";
        }
    }

    private static Integer getSalaryByRoleAndAge(String role, Integer age) {
        if (role != null && age != null) {
            if ("Manager".equalsIgnoreCase(role) && age > 30) {
                return 120000;
            } else if ("Developer".equalsIgnoreCase(role) && age > 25) {
                return 90000;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
