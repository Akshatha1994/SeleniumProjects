package java_programs;

public class constructorPractice {
	static String name = "Bob";
	
	constructorPractice(String name)
	{
		this.name = name;
	}
	
	public void friend()
	{
		//String name = "John";
		System.out.println("Name inside method: " +name);
	}
	

	public static void main(String[] args)
	{
		System.out.println("Calling the global variable:" + constructorPractice.name);
		constructorPractice practice = new constructorPractice("John");
		
		practice.friend();
		System.out.println("Calling the constructor assigned variable: " + practice.name);

	}

}
