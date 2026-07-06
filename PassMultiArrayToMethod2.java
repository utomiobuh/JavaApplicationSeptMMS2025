public class PassMultiArray2{
    public static void main(String[] args) {
        // Define a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Pass the array to the method
        printMatrix(matrix);
    }

    // Method that accepts a 2D array
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}