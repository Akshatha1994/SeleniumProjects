package java_programs;

public class java_pyramid3 {

	public static void main(String[] args)
	{
		for (int i = 1; i<5 ; i++)
		{
			for (int j = 4 ; j> i ; j--)   
			{
				System.out.print(" ");
			}
			for (int k = 0 ; k < i ; k++)
				{
					System.out.print(i);
					System.out.print(" ");;
				}
				
			
			System.out.println("");
		}


	}

}




/*    1 
 *   2 2
 *  3 3 3
 * 4 4 4 4 */
