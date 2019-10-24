package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new LinkedHashMap<>();
        Map<Integer, String> map3 = new TreeMap<>();

        testMap(map);
        testMap(map2);
        testMap(map3);
    }

    private static void testMap(Map<Integer, String> map) {
        map.put(2, "two");
        map.put(1, "one");
        map.put(8, "eight");
        map.put(5, "five");

        System.out.println("----------");
        for(Integer key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
