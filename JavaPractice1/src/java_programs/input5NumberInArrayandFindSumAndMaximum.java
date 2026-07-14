package java_programs;

public class input5NumberInArrayandFindSumAndMaximum {

	public static void main(String[] args) {
		// Input 5 numbers in an array and calculate their sum and find maximum
		
		int[] num = {2, 6, 2, 6, 12, 20};
		int sum = 0;
		int maximum = 0;
		
		for (int i = 0 ; i < num.length ; i++)
		{
			sum = sum+num[i]; 
			 if(num[i]> maximum)
			 {
				 maximum = num[i];
			 }
			 else
			 {
				 num[i]++;
			 }
		}
		System.out.println("Sum of all the array values is : " + sum);
		System.out.println("Maximum number is : " + maximum);
		

	}

}
