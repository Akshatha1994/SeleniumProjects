package java_programs;

import java.util.Scanner;

public class printVowels {

	public static void main(String[] args) {
		//print vowels - a, e, i, o, u
		
		Scanner sc = new Scanner(System.in);
		String name;
		int count = 0;
		
		System.out.println("Enter the name : ");
		name = sc.next();
		
		
		for (int i = 0 ; i <name.length() ; i++)
		{
			char c = name.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' ||c == 'o' || c == 'u')
			{
				count ++;
			}
			
			}
		System.out.println("Number of vowels is :" + count);
		

	}

}
