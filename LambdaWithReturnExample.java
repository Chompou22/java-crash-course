// Functional Interface
interface Greeting {
    String greet(String name);
}

public class LambdaWithReturnExample {
    public static void main(String[] args) {
        // Lambda expression with a return statement
        Greeting greet = (name) -> {
            return "Hello, " + name + "!";
        };

        // Using the lambda expression
        String message = greet.greet("John");
        System.out.println(message);
    }
}

