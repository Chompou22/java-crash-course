interface Greeting {
    void greet();
}

class Outer {
    void display() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        greeting.greet();
    }
}


public class AnonymouseInnerClass {
    public static void main(String[] args) {
        // Instantiate the outer class
        Outer outer = new Outer();

        // Call the display method of the outer class, which instantiates and calls the greet method of the anonymous inner class
        outer.display(); // Output: Hello from anonymous inner class
    }
}

/*
An anonymous inner class implements the Greeting interface.
It is declared and instantiated at the same time within the display method of the Outer class.
It provides an implementation for the greet method directly.
 */
