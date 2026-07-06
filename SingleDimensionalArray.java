public class SingleDimensionalArray {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 12, 15, 20, 35, 26, 30};

        System.out.printf("The Element at index 5 is %d%n", numbers[5]);
        System.out.printf("The element at index 9 is %d%n", numbers[9]);

        System.out.printf("========================================%n");
        System.out.printf("Traversing through the elements of the array:%n");

        // Fixed the condition here: changed '1 < 10' to 'i < numbers.length'
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %d%n", i, numbers[i]);
        }
    }
}