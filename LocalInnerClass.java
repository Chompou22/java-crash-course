class Outer {
    void display() {
        int localVar = 10;

        class Inner {
            void show() {
                System.out.println("Local inner class accessing localVar: " + localVar);
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}


public class LocalInnerClass {
    public static void main(String[] args) {
        // Instantiate the outer class
        Outer outer = new Outer();

        // Call the display method of the outer class, which in turn instantiates and calls the show method of the local inner class
        outer.display(); // Output: Local inner class accessing localVar: 10
    }
}

/*
The Inner class is defined within the display method of the Outer class.
It has access to the localVar variable of the method, which must be final or effectively final.
It is instantiated within the method itself.
 */
