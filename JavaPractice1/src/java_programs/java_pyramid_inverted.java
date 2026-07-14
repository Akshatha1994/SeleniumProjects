package java_programs;

public class java_pyramid_inverted 
{
	public static void main(String[] args) 
	{
		int k = 1;
		for (int i = 4;i>0;i--)
		{
			for (int j = 0; j<5-i; j++)	
			{
				System.out.print(k);	
				k++;
				System.out.print("\t");
			}
			System.out.println("");
			
			
		}
		
		
		
	}

}




/* 1 
 * 2 3
 * 4 5 6
 * 7 8 9 10  */

 