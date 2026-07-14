package java_programs;

public class childDemo extends parentDemo
{
	String name = "QAClickAcademy";
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}

	public static void main(String[] args) 
	{
		childDemo cd = new childDemo();
		cd.getStringData();

	}

}
