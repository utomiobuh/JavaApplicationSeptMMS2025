import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        
        // -------------------------------------------------------------
        // a) Set the 10 elements of integer array counts to zero.
        // -------------------------------------------------------------
        System.out.println("--- Part A: counts Array ---");
        
        int[] counts = new int[10]; // Automatically initialized to zero by Java
        
        // Demonstrating resetting an already existing array using Arrays.fill
        Arrays.fill(counts, 0);
        
        // Verify the array contains zeros
        System.out.println("counts array elements: " + Arrays.toString(counts));
        System.out.println();

        
        // -------------------------------------------------------------
        // b) Add one to each of the 15 elements of integer array bonus.
        // -------------------------------------------------------------
        System.out.println("--- Part B: bonus Array ---");
        
        int[] bonus = new int[15]; // Starts with fifteen 0s
        System.out.println("Before adding one: " + Arrays.toString(bonus));
        
        // Loop through and modify each element by adding 1
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }
        
        System.out.println("After adding one:  " + Arrays.toString(bonus));
        System.out.println();

        
        // -------------------------------------------------------------
        // c) Display the five values of integer array bestScores in column format.
        // -------------------------------------------------------------
        System.out.println("--- Part C: bestScores Array ---");
        
        int[] bestScores = {95, 88, 99, 91, 84}; // Initialized with 5 sample scores
        
        // Use an enhanced for loop to print out the elements in a vertical column
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}