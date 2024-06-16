abstract class Greeting {
    abstract void greet();
}

public class AbstractAnonymousExample {
    public static void main(String[] args) {
        // Using anonymous inner class to implement the abstract class Greeting
        Greeting greeting = new Greeting() {
            @Override
            void greet() {
                System.out.println("Hello from abstract anonymous inner class");
            }
        };

        // Calling the greet method of the anonymous inner class
        greeting.greet();  // Output: Hello from abstract anonymous inner class
    }
}
