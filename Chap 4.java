import java.util.Scanner;
public class TestA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (age >= 65)
            System.out.println("Age is greater than or equal to 65");
        else 
            System.out.println("Age is less than 65");
    }
}