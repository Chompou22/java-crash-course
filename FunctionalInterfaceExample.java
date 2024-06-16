// Functional Interface
interface Calculator {
    // Abstract method in the functional interface
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the calculate method
        Calculator addition = (a, b) -> a + b; // Lambda Expression
        System.out.println("Addition result: " + addition.calculate(5, 3));

        // Using a lambda expression with a block body
        Calculator subtraction = (a, b) -> {
            return a - b;
        };
        System.out.println("Subtraction result: " + subtraction.calculate(10, 7));
    }
}

/*
Summary:
Functional Interface: An interface with only one abstract method.
Behavior Contract: Represents a specific action or behavior that needs to be implemented.
Lambda Expressions: Provide a concise way to implement the abstract method of a functional interface.
Method References: Another way to implement the abstract method using existing methods or constructors.
Functional Programming: Enables functional programming paradigms in Java, treating functions as first-class citizens.
Functional interfaces play a crucial role in modern Java programming, facilitating the use of lambda expressions and enabling functional programming techniques. They provide a flexible and concise way to represent behaviors and actions in your code.
 */
