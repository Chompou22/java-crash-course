import java.util.HashSet; // Import the HashSet class
import java.util.Set; // Import the Set interface

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet to hold String elements
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("element1");
        set.add("element2");
        set.add("element3");
        set.add("element1"); // Adding a duplicate element

        // Note that duplicate elements are not added
        System.out.println("HashSet: " + set);

        // Removing an element from the HashSet
        set.remove("element2");

        // Checking if an element exists in the HashSet
        boolean containsElement = set.contains("element3");
        System.out.println("Does the HashSet contain 'element3'? " + containsElement);

        // Iterating over elements of the HashSet
        System.out.println("All Elements:");
        for (String element : set) {
            System.out.println(element);
        }

        // Checking the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Checking if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}

