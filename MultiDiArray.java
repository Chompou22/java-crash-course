public class MultiDiArray {
    public static void main(String[] args) {
        // Declaration and creation of a 2D array
        int[][] twoDArray = new int[3][4]; // 3 rows, 4 columns

        // Initialization of the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDArray[i][j] = i + j; // Assigning values for demonstration
            }
        }

        // Accessing and printing elements of the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for a new row
        }
    }
}
