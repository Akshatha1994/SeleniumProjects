package java_programs;

public class swap_array_in_ascending_order 
{

	public static void main(String[] args) 
	{
		int temp = 0;
		
		int a[] = {4,2,9,1};
		for(int i = 0; i<a.length; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j])   //4>2
				{
					temp = a[i];  //temp = 4
					a[i] = a[j];  //a[i] = 2
					a[j] = temp;  //a[j] = 4
				}
			}
		
		System.out.println(a[i]);
		}
		
	}
}
			
		

			
			
			
		
















			
			
			
			
			
			
			
			
	/*	int min_num = min; //     min_num = 1
		for (int j = 0; j<a.length; j++)
		{
			System.out.println(a[j]);

		  if(min_num<a[j])   //1<4    1<2
		  {
			   
			   int temp = a[j];  //temp = 4    temp = 2
			  a[j] = min_num; //a[0] = 1    a[1] = 1`
			  a[min_row_num]= temp;   // a[3] = 4 
			   
			
		   }
		  System.out.println(a[j]);   //1,
			
		}
		System.out.println(min);
		}
	System.out.println(min_row_num);   //3


} */




