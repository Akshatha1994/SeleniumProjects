package java_programs;

import java.util.Scanner;

public class validateEmailID {

	public static void main(String[] args) {
		// validate email ID - should have one "@" and one "." operator
		
		Scanner sc = new Scanner(System.in);
		String emailID;
		int count = 0;
		int count1 = 0;
		
		
		System.out.println("Enter the email ID : ");
		emailID = sc.next();
		
		
		for(int i = 0 ; i < emailID.length(); i++) 
		{
			//System.out.println("length of the string is :" + emailID.length());   
			char c = emailID.charAt(i);
			if(c =='@')
			{
					count++;		
			}
			if(c == '.')
			{
				count1++;
			}
		}
		
			if(count>0 && count1>0)
			{
				System.out.println("Email is valid");
			}
			else
			{
				System.out.println("Email is not valid");
			}

	}

}
