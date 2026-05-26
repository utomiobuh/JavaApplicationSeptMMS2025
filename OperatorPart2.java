public class OperatorPart2{
	public static void main(String[]{
		//Logical Operator(&&,||,!)
		int num1 = 15;
		int num2 = 30;
		int num3 = 18;
		
		public class OperatorPart2 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 30;

        // Example 1: Logical AND (&&) with Short-Circuiting
        // Since (num1 > 20) is false, Java stops and never executes (num2++)
        if (num1 > 20 && num2++ > 25) {
            System.out.println("Condition met");
        }
        System.out.println("After && - num1: " + num1 + ", num2: " + num2); 
        // num2 remains 30 because the second part was skipped.

        // Example 2: Logical OR (||) with Short-Circuiting
        // Since (num1 > 10) is true, Java stops and never executes (++num2)
        if (num1 > 10 || ++num2 > 40) {
            System.out.println("Condition met");
        }
        System.out.println("After || - num1: " + num1 + ", num2: " + num2);
        // num2 still remains 30.

        // Example 3: Post-increment vs Pre-increment in Logic
        // Post-increment (num1++) uses the value first, then increments.
        // 15 > 14 is true, so the increment happens, AND the second part runs.
        if (num1++ > 14 && --num2 < 30) {
            System.out.println("Condition met");
        }
        System.out.println("Final - num1: " + num1 + ", num2: " + num2);
        // num1 is now 16, num2 is now 29.
    }
} 
	}
	 )
}