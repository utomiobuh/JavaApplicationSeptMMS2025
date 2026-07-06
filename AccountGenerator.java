import java.util.Random;

public class AccountGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Start with the required prefix "000"
        StringBuilder accountNumber = new StringBuilder("000");

        // Loop 7 times to add the remaining 7 digits
        for (int i = 0; i < 7; i++) {
            int nextDigit = random.nextInt(10); // Generates a number from 0 to 9
            accountNumber.append(nextDigit);
        }

        // Print the final 10-digit account number
        System.out.println("Generated Account Number: " + accountNumber.toString());
    }
}