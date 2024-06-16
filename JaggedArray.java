public class JaggedArray {
    public static void main(String[] args) {
        // Declaration and creation of a jagged array
        int[][] jaggedArray = new int[3][];

        // Initialization of the jagged array
        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5, 6, 7 };
        jaggedArray[2] = new int[] { 8, 9 };

        // Accessing and printing elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for a new row
        }
    }
}

// A jagged array is an array of arrays where each sub-array can have a different length.
