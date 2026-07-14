package java_programs;

public class java_pyramid6 {

	public static void main(String[] args) {
		
		/*
		 1  
		 1 2 
		 1 2 3
		 1 2 3 4 
		 1 2 3 4 5
		 		 */
		
		for (int row = 1 ; row<= 5 ; row++)
		{
			for (int column = 1 ; column <=row ; column ++)
			{
				System.out.print(column);
				System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}

}
