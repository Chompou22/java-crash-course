public class StringClass {
    public static void main(String[] args) {
        // String Methods
        String myString = "Hello, Java!";
        int length = myString.length();
        char firstChar = myString.charAt(0);
        String subString = myString.substring(7);

        System.out.println(length);
        System.out.println(firstChar);
        System.out.println(subString);
    }
}

/*
Here's a concise summary of the key concepts related to Java strings:

String Class:
In Java, a String is a class representing a sequence of characters.

Declaration and Initialization:
Strings can be declared and initialized using the syntax: String myString = "Hello, Java!";

Immutable Nature:
Strings are immutable, meaning their content cannot be changed. Operations create new string objects.

String Pool:
Java uses a string pool to store literal strings, optimizing memory by reusing existing string references.

Concatenation:
Strings can be concatenated using the + operator, creating a new string with combined content.

String Methods:
The String class provides methods like length(), charAt(), substring(), and more for string manipulation.

String Comparison:
Use equals() for content comparison; == checks for reference equality.

StringBuilder and StringBuffer:
For efficient string modification, use StringBuilder (single-threaded) or StringBuffer (multi-threaded) due to their mutable nature.

Single-Threaded Execution:
Single-threaded means executing tasks sequentially on a single thread of execution, limiting concurrency.

Understanding these concepts is crucial for effective string manipulation and efficient use of memory in Java applications.
 */
