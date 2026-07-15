package java_programs;

import java.util.Scanner;

public class initializeStringArrayAndPrint {

	public static void main(String[] args) {
		//Initialize the string array and print it
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of people : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		
		System.out.println("Enter the names : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Name " + (i+1) + " : ");
			names[i] = sc.nextLine();
		}
		
		System.out.println("Names are  : ");
		for (int i = 0 ; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}

	}

}
