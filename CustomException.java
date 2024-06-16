// Custom exception class
class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }

    MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Example usage of custom exception
public class CustomException {
    public static void main(String[] args) {
        try {
            // Simulate a situation where the custom exception might be thrown
            throwCustomException();
        } catch (MyCustomException e) {
            // Handle the custom exception
            System.out.println("Custom exception caught: " + e.getMessage());
            // Print the stack trace for debugging
            e.printStackTrace();
        }
    }

    // Method that throws the custom exception
    private static void throwCustomException() throws MyCustomException {
        // Simulate an error condition
        boolean errorCondition = true;
        if (errorCondition) {
            // Throw the custom exception with a custom error message
            throw new MyCustomException("An error occurred due to a specific condition.");
        }
    }
}

