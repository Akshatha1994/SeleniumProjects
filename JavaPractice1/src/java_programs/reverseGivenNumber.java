package java_programs;

import java.util.Scanner;

public class reverseGivenNumber {

	public static void main(String[] args) {
		// reverse given number -> input = 64 and output should be 46
		
		
		int givenNumber = 0;
		int reverseNumber = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed :");
		givenNumber = sc.nextInt();
		
		while(givenNumber!=0)
		{
			reverseNumber = reverseNumber * 10;   
			reverseNumber = reverseNumber + givenNumber % 10 ; 
			givenNumber = givenNumber/10;
		}
		
		System.out.println("The reversal number for given number is : " +reverseNumber);

	}

}
