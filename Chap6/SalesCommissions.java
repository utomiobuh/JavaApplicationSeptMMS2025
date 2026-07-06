import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array of counters for the 9 salary ranges
        // Index 0: $200-299, Index 1: $300-399, ..., Index 8: $1000 and over
        int[] counters = new int[9];
        
        System.out.println("Enter gross sales (enter -1 to finish):");
        double grossSales = input.nextDouble();
        
        while (grossSales != -1) {
            // Calculate total salary: $200 flat + 9% of gross sales
            int salary = (int) (200 + (0.09 * grossSales));
            System.out.printf("Salary is: $%d%n", salary);
            
            // Determine the range index
            int rangeIndex = (salary - 200) / 100;
            
            // Cap the index at 8 for salaries $1000 and over
            if (rangeIndex > 8) {
                rangeIndex = 8;
            }
            
            // Increment the appropriate counter if the salary is valid (>= $200)
            if (rangeIndex >= 0) {
                counters[rangeIndex]++;
            }
            
            System.out.print("Enter gross sales (enter -1 to finish): ");
            grossSales = input.nextDouble();
        }
        
        // Display results in a tabular format
        System.out.printf("%n%-15s%s%n", "Salary Range", "Number of Salespeople");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < 8; i++) {
            System.out.printf("$%3d-$%3d       %d%n", 200 + (i * 100), 299 + (i * 100), counters[i]);
        }
        System.out.printf("$1000 and over  %d%n", counters[8]);
        
        input.close();
    }
}