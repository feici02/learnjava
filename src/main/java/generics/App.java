package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MyGeneric<Integer> mg1 = new MyGeneric<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        mg1.setList(list1);
        mg1.getList().forEach(System.out::println);

        System.out.println("--------------------");

        MyGeneric<String> mg2 = new MyGeneric<>();

        List<String> list2 = new LinkedList<>();
        list2.add("Jason");
        list2.add("William");
        list2.add("Robert");

        mg2.setList(list2);
        mg2.getList().forEach(System.out::println);

        System.out.println("--------------------");

        MySecondGeneric<Integer, String> msg1 = new MySecondGeneric<>(10, "Jason");
        MySecondGeneric<String, Integer> msg2 = new MySecondGeneric<>("Jason", 10);

        System.out.println(msg1.getKey() + "\t" + msg1.getValue());
        System.out.println(msg2.getKey() + "\t" + msg2.getValue());
    }
}
