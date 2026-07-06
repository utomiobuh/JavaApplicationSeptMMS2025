import java.util.HashSet;

public class EmailManager {
    public static void main(String[] args) {
        
        HashSet<String> emailSet = new HashSet<>();

        
        emailSet.add("alice@example.com");
        emailSet.add("bob@domain.com");
        emailSet.add("charlie@web.com");

        System.out.println("Initial email list:");
        System.out.println(emailSet);
        System.out.println("-----------------------------------");

          
        System.out.println("Trying to add 'alice@example.com' again...");
        boolean isAdded = emailSet.add("alice@example.com");

        // The .add() method returns false if the item already exists
        if (!isAdded) {
            System.out.println("Duplicate blocked! HashSet already contains this email.");
        }

        System.out.println("-----------------------------------");

        // 4. Print the final list to show it only has unique emails
        System.out.println("Final unique email list (" + emailSet.size() + " total):");
        for (String email : emailSet) {
            System.out.println("- " + email);
        }
    }
}