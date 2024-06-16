import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter your name: ");

        // Reading user input as a string
        String name = scanner.nextLine();

        // Displaying the input received from the user
        System.out.println("Hello, " + name + "! Welcome to Scanner Example.");

        // Closing the Scanner object
        scanner.close();
    }
}
