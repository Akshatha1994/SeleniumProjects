package java_programs;

public class swapping_nums_without_temp {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		a = a + b; //9
		b = a - b; //9-4 = 5    a = 9, b = 5
		a = a - b;  //9-5 = 4
		
		System.out.println(a);
		System.out.println(b);

	}

}
