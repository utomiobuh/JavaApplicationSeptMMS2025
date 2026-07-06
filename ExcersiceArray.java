public class ExcersiceArray{
	public static void main(String [] args){
	int[] nums = {6,9,5,12,4,8,5,2,16,14};
		int count = 0;
		
		for (int n : nums)
			if (n % 2 == 0) count++;
		
		System.out.println("Evens: "+count);
	}
}