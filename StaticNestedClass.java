class Outer {
    static int outerStaticVariable = 5;

    static class Nested {
        void display() {
            System.out.println("Static nested class accessing outerStaticVariable: " + outerStaticVariable);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        // Accessing the static nested class
        Outer.Nested nested = new Outer.Nested();

        // Call the display method of the nested class
        nested.display(); // Output: Static nested class accessing outerStaticVariable: 5
    }
}

/*
The Nested class is a static member of the Outer class.
It does not have access to the instance variables and methods of the Outer class without an object reference.
It can be instantiated without an instance of the Outer class.
 */