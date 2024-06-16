// File: MainClass.java
public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass();

        // Accessing public members
        myObject.publicVariable = 10;
        myObject.publicMethod();

        // Uncommenting the lines below will result in compilation errors
        // myObject.privateVariable = 20; // privateVariable is private
        // myObject.privateMethod(); // privateMethod is private

        // Uncommenting the lines below will result in compilation errors
        // myObject.protectedVariable = 30; // protectedVariable has protected access
        // myObject.protectedMethod(); // protectedMethod has protected access

        // Uncommenting the lines below will result in compilation errors
        // myObject.defaultVariable = 40; // defaultVariable is package-private
        // myObject.defaultMethod(); // defaultMethod is package-private
    }
}
