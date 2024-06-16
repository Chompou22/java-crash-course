import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map interface

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to hold <String, Integer> key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);

        // Accessing values using keys
        int valueForKey2 = map.get("key2");
        System.out.println("Value for key 'key2': " + valueForKey2);

        // Iterating over key-value pairs
        System.out.println("All Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Removing a key-value pair from the HashMap
        map.remove("key3");

        // Checking if a key exists in the HashMap
        boolean containsKey = map.containsKey("key1");
        System.out.println("Does the HashMap contain key 'key1'? " + containsKey);

        // Checking the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // Checking if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }
}
