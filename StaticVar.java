public class StaticVar {
    int instanceVariable;  // Instance variable

    // Non-static method accessing instance variable
    public void nonStaticMethod() {
        System.out.println("Instance Method: " + instanceVariable);
    }

    // Static method accessing static variable
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        // Creating an instance of StaticVar
        StaticVar myObject = new StaticVar();

        // Calling the non-static method on the instance
        myObject.nonStaticMethod();

        // Calling the static method directly on the class
        StaticVar.staticMethod();
    }
}
