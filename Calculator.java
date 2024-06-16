public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = new Calculator().add(5, 3);
        System.err.println(result);
    }
}

/*
Certainly! Here's a concise summary of anonymous objects in Java:

Anonymous Object:
An object created without assigning it to a variable is called an anonymous object.
It is instantiated and used directly where it's needed.
One-Time Use:
Typically used for a single, immediate task and not stored for later use.
Useful for short-term operations without cluttering code with unnecessary variable declarations.
Example:
Example using a Calculator class:
java
Copy code
int result = new Calculator().add(5, 3);
Here, an anonymous object of the Calculator class is created and used immediately to call its add method.
Using anonymous objects can lead to more concise code when a temporary object is needed for a specific task.
 */
