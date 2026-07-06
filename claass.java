import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
	    int[] numbers = {5,8,2,3,9,4,1,8,7,10};	
		int[] a = {7,9,6};
		int[] b = {8,9,6};
		
		int[] c = {7,8,9};
		int[] d = {9,9,6};
		int[] myFillArr = new int [10]
		Arrays.fill(myFillArr,5);
		
        Arrays.sort(numbers);
		System.out.printin("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}			
		System.out.printin("Binary Search");
		int index = Arrays.binarysearch(numbers,9);
		System.out.printf("The index number of 9 is %d%n",index);
		
		boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n, isEqual");
		
		System.out.printin("My fill arrays are");
		for(int number : myFillArr){
			System.out.printf("%d%n",number);
		}
		
		int[] evenNumbers = {2,4,6,8,10,12,14,16,18,20};
		int[] copyArr Arrays.copyof(evenNumbers,10);
		System.out.printin("The elements of the array are");
		for(int arr : copyArr){
			System.out.printf("%d%n",arr);
		}
		
		System.out.printin(Arrays.toString(evenNumbers);
	}
}and use def to string

