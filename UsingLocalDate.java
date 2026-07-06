import java.time.LocalDate;

public class UsingLocalDate{
	public static void main(String[] args){
		LocalDate todaysDate = LocalDate.now();
		LocalDate myBirthDate = LocalDate.of(2008,8,29);
		System.out.printf("Todays Date is %s%n",todaysDate);
		System.out.printf("My Birthday is %s%n",myBirthDate);
	}
}