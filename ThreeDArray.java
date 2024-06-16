public class ThreeDArray {
    public static void main(String[] args) {
        // Declaration and creation of a 3D array
        int[][][] threeDArray = new int[2][3][4]; // 2 layers, each with 3 rows and 4 columns
        
        // Initialization of the 3D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    threeDArray[i][j][k] = i + j + k; // Assigning values for demonstration
                }
            }
        }
        
        // Accessing and printing elements of the 3D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next line for a new row
            }
            System.out.println(); // Add a blank line between layers for better readability
        }
    }
}
