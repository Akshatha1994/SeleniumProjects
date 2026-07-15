package java_programs;

public class reversingString {

	public static void main(String[] args) {
		// Reversing the string
		
		String s = "Hello";
		
		for (int i = s.length() - 1 ; i >= 0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		/*
		 * String s = "program"; 
		 * char[] c = s.toCharArray();
		 * for (int i = s.length() - 1 ; i >= 0 ; i--) 
		 * {
		 *  System.out.println(c[i]); 
		 *  }
		 */
		
		
		
	}

}
