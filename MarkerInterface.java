// Marker Interface
interface Serializable {
    // No methods
}

class MyClass implements Serializable {
    // Class marked with a marker interface
}

public class MarkerInterface {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass();

        // Checking if MyClass implements Serializable
        if (obj instanceof Serializable) {
            System.out.println("MyClass implements Serializable");
        } else {
            System.out.println("MyClass does not implement Serializable");
        }
    }
}

