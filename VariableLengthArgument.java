public class VariableLengthArgument{
    public static void main(String[] args) {

        System.out.println("Sum of 2 numbers: " + sum(5, 10));
        System.out.println("Sum of 4 numbers: " + sum(1, 2, 3, 4));
        System.out.println("Sum of 0 numbers: " + sum());
    }


    public static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        return total;
    }
}