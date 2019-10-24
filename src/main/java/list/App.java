package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jason");
        names.add("William");
        names.add("Robert");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------");

        names
                .stream()
                .forEach(System.out::println);

        System.out.println("----------");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            iterator.remove();
        }
    }
}
