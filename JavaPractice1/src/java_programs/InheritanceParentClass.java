package java_programs;

public class InheritanceParentClass 
{
	String characterName = "John";
	
	//open the webpage
	public void open()
	{
		System.out.println("Webpage is opened from the parent class");
	}
	
	//navigate to the URL
	public void navigate(String name)
	{
		System.out.println("Webpage is navigated from the parent class");
	}
	
	//close the webpage
	public void close()
	{
		System.out.println("Webpage is closed from the parent class");
	}

}
