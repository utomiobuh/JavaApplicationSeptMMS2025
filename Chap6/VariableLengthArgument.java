public class VariableLengthArgument {
    
    // Method to calculate product using a variable-length argument list
    public static int product(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        int totalProduct = 1;
        for (int num : numbers) {
            totalProduct *= num;
        }
        return totalProduct;
    }

    public static void main(String[] args) {
        // Test calls with a different number of arguments
        System.out.printf("Product of (2, 3): %d%n", product(2, 3));
        System.out.printf("Product of (5, 4, 3): %d%n", product(5, 4, 3));
        System.out.printf("Product of (10, 2, 5, 2): %d%n", product(10, 2, 5, 2));
        System.out.printf("Product of no arguments: %d%n", product());
    }
}