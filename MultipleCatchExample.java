public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that might throw different types of exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catching and handling ArithmeticException
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } catch (Exception e) {
            // Catching and handling any other exceptions not caught by previous catch blocks
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
