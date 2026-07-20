package java_programs;

public class javaPracticee {

	public static void main(String[] args) 
	{
		// Input is "Akshatha Dalve" and Output is "ahtahska evlad"
		
		String s = "Akshatha Dalve";
		
		String[] words = s.split(" ");
		
		for (String word : words)
		{
			char ch[] = word.toCharArray();
			for(int i = ch.length-1 ; i>=0 ; i--) 
			{
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}

	}

}
