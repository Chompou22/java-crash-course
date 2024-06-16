// File: MyClass.java
public class MyClass {
    public int publicVariable;
    private int privateVariable;
    protected int protectedVariable;
    int defaultVariable; // default (package-private) access

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
