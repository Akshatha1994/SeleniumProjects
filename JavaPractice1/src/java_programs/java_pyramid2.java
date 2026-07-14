package java_programs;

public class java_pyramid2 {

	public static void main(String[] args) 
	{
		int k =3;
		for (int i = 1;i<4;i++)
		{
			for (int j = 0; j<i;j++)         
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
				
			}
			System.out.println("");
		}


	}

}




/* 3 
 * 6 9
 * 12 15 18 */