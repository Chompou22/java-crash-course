// Functional Interface
interface Calculator1 {
    int calculate(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the calculate method
        Calculator1 addition = (a, b) -> a + b; // Lambda Expression
        System.out.println("Addition result: " + addition.calculate(5, 3));

        // Using a lambda expression with a block body
        Calculator1 subtraction = (a, b) -> {
            return a - b;
        };
        System.out.println("Subtraction result: " + subtraction.calculate(10, 7));
    }
}
