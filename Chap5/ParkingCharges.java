import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        
        System.out.println("Enter the number of hours parked for each customer (enter -1 to quit):");
        double hours = input.nextDouble();
        
        while (hours != -1) {
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Current customer charge: $%.2f%n", charge);
            System.out.printf("Running total of yesterday's receipts: $%.2f%n", totalReceipts);
            
            System.out.println("\nEnter hours for next customer (or -1 to quit):");
            hours = input.nextDouble();
        }
        
        System.out.printf("Final total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }

    public static double calculateCharges(double hours) {
        double minimumFee = 2.00;
        double maximumFee = 10.00;
        double charge = minimumFee;

        if (hours > 3.0) {
            // Math.ceil is used to charge for "part thereof" in excess of three hours
            double excessHours = Math.ceil(hours - 3.0);
            charge += (excessHours * 0.50);
        }

        // Ensure the charge does not exceed the maximum 24-hour fee
        return Math.min(charge, maximumFee);
    }
}