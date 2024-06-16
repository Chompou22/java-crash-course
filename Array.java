public class Array {
    public static void main(String[] args) {
        // Syntax for creating an array of integers with size 5
        int[] myArray = new int[5];

        // Initializing an array with values
        int[] initializedArray = {1, 2, 3, 4, 5};

        // Accessing elements and printing them
        System.out.println("Elements of myArray:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1; // Assigning values for demonstration
            System.out.println(myArray[i]);
        }

        // Accessing elements of initializedArray
        System.out.println("Elements of initializedArray:");
        for (int value : initializedArray) {
            System.out.println(value);
        }
    }
}
