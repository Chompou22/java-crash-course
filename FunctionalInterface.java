// Functional Interface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Lambda expression with a functional interface
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition result: " + addition.calculate(5, 3));
    }
}


