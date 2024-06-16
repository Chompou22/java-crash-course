import java.util.ArrayList; // Import the ArrayList class

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("element1");
        list.add("element2");
        list.add("element3");

        // Accessing elements of the ArrayList
        String firstElement = list.get(0);
        System.out.println("First Element: " + firstElement);

        // Iterating over elements of the ArrayList
        System.out.println("All Elements:");
        for (String element : list) {
            System.out.println(element);
        }

        // Removing an element from the ArrayList
        list.remove("element2");

        // Checking the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList after removal: " + size);

        // Checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}
