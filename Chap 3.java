import java.util.Scanner;
public class Classwork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Hello " + name + ", you are " + age);
        System.out.println("Address: " + address);
    }
}