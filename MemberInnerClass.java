class Outer {
    int outerField;

    class Inner {
        void display() {
            System.out.println("Inner class accessing outerField: " + outerField);
        }
    }
}


public class MemberInnerClass {
    public static void main(String[] args) {
        // Instantiate the outer class
        Outer outer = new Outer();

        // Set the value of outerField
        outer.outerField = 10;

        // Instantiate the inner class using the outer class instance
        Outer.Inner inner = outer.new Inner();

        // Call the method of the inner class
        inner.display(); // Output: Inner class accessing outerField: 10
    }
}

/*
The Inner class is inside the Outer class.
It has access to the outerField of the Outer class.
It can only be instantiated with an instance of the Outer class.
 */