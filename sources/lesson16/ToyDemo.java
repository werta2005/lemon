package lesson16;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class ToyDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Кубик", new Toy("Кубик", 67));
        map.put("Маш", new Toy("Маш", 56));
        map.put("Кукла", new Toy("Кукла", 32));

        printKeys(map);
        printValues(map);
        printSet(map);
    }

    private static void printSet(Map<String, Toy> map) {
        Set<Map.Entry<String,Toy>> entrySet = map.entrySet();
        for (Map.Entry<String,Toy> entry : entrySet)
          {
            //  System.out.println("Key"+entry.getKey);
             // System.out.println("Value"+entry.getValue);
          }
    }

    private static void printValues(Map<String, Toy> map) {
        Collection<Toy> collection = map.values();
        System.out.println(collection);
    }

    private static void printKeys(Map<String, Toy> map) {
        Set<String> set = map.keySet();
        System.out.println(set);

    }
}
