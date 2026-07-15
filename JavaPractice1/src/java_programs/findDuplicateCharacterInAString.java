package java_programs;

import java.util.Scanner;

public class findDuplicateCharacterInAString {

	public static void main(String[] args) {
		// Print the duplicate characters in a string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");  // besst
		String text = sc.next();
		char[] allChar = text.toCharArray();        //b e s s t 
		boolean[] b = new boolean[text.length()];   //
		
		
		System.out.println("Character occurances : ");
		
		for (int i = 0 ; i < allChar.length ; i++)        // 0 to 4
		{
			int c = 0;
			if( b[i]) continue;
			for (int j = 0 + i ; j < allChar.length ; j++)   // 1 to 4
			{
				if(allChar[i] == allChar[j])
				{
					c++;
					b[j] = true;
				}
			}
			System.out.println(allChar[i] + ":" + c);
		}
		
		
		
		


	}

}
