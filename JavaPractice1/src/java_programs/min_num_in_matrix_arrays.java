package java_programs;

public class min_num_in_matrix_arrays {

	public static void main(String[] args) 
	{
		
		int a[][] = {{1,2,3},{4,6,3},{8,3,2}};
		int min=a[0][0];
		for (int i = 0; i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
			}
		}
		System.out.println(min);


	}

}




/* 1 2 3
 * 4 6 3
 * 8 3 2 */
