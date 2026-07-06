import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        // All allowed characters in one place
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Loop 15 times to pick 15 random characters
        for (int i = 0; i < 15; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        // Print the result
        System.out.println("Generated Password: " + password.toString());
    }
}