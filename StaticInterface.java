// Static Interface
interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        // Calling static method of an interface
        int result = MathOperations.add(5, 3);
        System.out.println("Addition result: " + result);
    }
}

