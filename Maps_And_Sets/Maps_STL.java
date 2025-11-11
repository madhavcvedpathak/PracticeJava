package Maps_And_Sets;

import java.util.*;

public class Maps_STL {
    public static void main(String[] args) {
        // 1. Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // 2. Add elements (put)
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial Map: " + map);

        // 3. Access elements
        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Contains key Banana? " + map.containsKey("Banana"));
        System.out.println("Contains value 30? " + map.containsValue(30));

        // 4. Update element
        map.put("Banana", 25); // updates the value
        System.out.println("After updating Banana: " + map);

        // 5. Remove element
        map.remove("Cherry");
        System.out.println("After removing Cherry: " + map);

        // 6. Iterate over keys
        System.out.println("Keys in map:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 7. Iterate over values
        System.out.println("Values in map:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // 8. Iterate over key-value pairs
        System.out.println("Entries in map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 9. Size of map
        System.out.println("Map size: " + map.size());

        // 10. Clear map
        map.clear();
        System.out.println("After clear(): " + map);
    }
}
