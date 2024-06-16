import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // Creating a BufferedReader object to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompting the user for input
        System.out.print("Enter your name: ");

        // Reading user input as a string
        String name = reader.readLine();

        // Displaying the input received from the user
        System.out.println("Hello, " + name + "! Welcome to BufferedReader Example.");
    }
}
