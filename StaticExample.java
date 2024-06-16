public class StaticExample {
    static int staticVariable;

    static {
        // Static block for initialization
        staticVariable = 42;
        System.out.println("Static block executed");
    }

    static void staticMethod() {
        // Static method
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static Variable: " + StaticExample.staticVariable);

        // Calling static method
        StaticExample.staticMethod();
    }
}
