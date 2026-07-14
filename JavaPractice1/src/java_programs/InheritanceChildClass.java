package java_programs;

public class InheritanceChildClass extends InheritanceParentClass
{
	@Override
	public void navigate(String name)
	{
		super.navigate(name);
		System.out.println("Navigating from the child class");
		System.out.println(characterName);
	}

}
