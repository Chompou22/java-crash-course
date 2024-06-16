public class Method {

    // Method declaration outside the main method
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Method invocation inside the main method
        int result = addNumbers(5, 7);
        System.out.println("Sum: " + result);
    }
}

/*
Method Basic :
Definition: A method is a block of code that performs a specific task.
Declaration: Methods are declared with a return type, a name, and optional parameters.
 */

/*
Syntax:
returnType methodName(parameter1Type parameter1, parameter2Type parameter2, ...) {
    // Method body
    // Code to perform a specific task
    // Optionally, return a value using the "return" keyword
}
 */

/*
Example:
1.Returning a Value:
2.Void Method (No Return Value):
3.Method Overloading (Different return types and also parameters but using the same method signature):
 */

/*
Noted Static Methods:
Definition: Belong to the class rather than an instance, called using the class name.

public static int addNumbers(int a, int b) {
        return a + b;
    }
 */

/*
Placement Rules:
Methods must be declared at the class level, not within other methods.
Methods are invoked inside other methods or by creating objects if they are not static.
 */

/*
Purpose:
Code Organization: Methods help structure and organize code, making it modular and reusable.
Task Abstraction: Encapsulates functionality into self-contained units.
Code Reusability: Allows the same logic to be reused in multiple parts of a program.
 */


/*
Method without static methods:
public class Method {

    // Non-static method declaration outside the main method
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        Method methodInstance = new Method();

        // Method invocation using the instance
        int result = methodInstance.addNumbers(5, 7);
        System.out.println("Sum: " + result);
    }
}
 */
