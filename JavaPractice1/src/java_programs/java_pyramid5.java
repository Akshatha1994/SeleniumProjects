package java_programs;

public class java_pyramid5 {

	public static void main(String[] args) {

		/*
		 * * 
		 * * *
		 * * * * 
		 * * * * * 
		 */
		
		for (int row = 1 ; row <= 5 ; row ++)
		{
			for (int column = 1 ; column <=row ; column ++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
