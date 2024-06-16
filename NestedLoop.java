public class NestedLoop {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

/*
In Java, a nested for loop is a loop inside another loop.
This allows you to create more complex iterations,
typically used for working with two-dimensional arrays, matrices, or performing tasks that involve multiple levels of iteration.
 */


// Basic structure :

/*
for (initialization1; condition1; update1) {
    // Outer loop code
    
    for (initialization2; condition2; update2) {
        // Inner loop code
    }
}
 */
