package java_programs;

public class reverseSpecificCharacterInAString {

	public static void main(String[] args) {
		// Reverse 3rd character with 1st character in a string
		// input is "program" and the output should be "gropram"
		
		String s = "program";
		char[] ch = s.toCharArray();
		int count = 0; 
		for (int i = 0 ; i < s.length() ; i ++)            // 0 to 7
		{   
			
			if (count == 3)
			{
				char temp = ch[0];   // p
				ch[0] = ch[i];       // ch[0] = g
				ch[i] = temp;       
			}
			else 
			{
				ch[i] = ch[i];
			}
			count++;

			
		}
		System.out.println(ch);

	}

}
