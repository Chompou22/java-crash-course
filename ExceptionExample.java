public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Catching and handling the exception
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Optional finally block executes regardless of whether an exception is thrown or caught
            System.out.println("Finally block executed");
        }
    }
}

/*

Certainly! Here's a concise summary of exceptions in Java:

An exception is an event that disrupts the normal flow of a Java program's execution.
Exceptions are categorized into two types:
Checked Exceptions: Checked at compile time; must be handled explicitly.
Unchecked Exceptions: Not checked at compile time; typically indicate runtime errors or unexpected conditions.
Exceptions are managed using try-catch blocks:
Code that might throw an exception is placed within a try block.
Exceptions are caught and handled by catch blocks.
The finally block, if present, executes regardless of whether an exception is thrown or caught.
 */
