package java_programs;

public class min_num_in_row_and_max_num_in_column {

	public static void main(String[] args) 
	{
		int a[][]= {{4,5,1},{4,8,3},{4,9,2}};
		int min=a[0][0];
		int min_column_number = 0;
		
		int k =0;
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					min_column_number = j;
					//System.out.println("Column of min number is:" + min_column_number);
					
				}
				
				//System.out.println(a[i][j]);
			}
			
		}
		int max = a[0][min_column_number];
		for (k=0;k<a.length;k++)
		{

		if(a[k][min_column_number]>max)
		{
			max = a[k][min_column_number];
		}
		}
		System.out.println("Minimum number in the matrix is:" +min);
		System.out.println("Maximun number in the matrix is:" +max);
		
		
	}

	}



/* 4 5 1
 * 4 8 3
 * 4 9 2 */
