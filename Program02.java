package class16_abstract_concreate;


abstract class red  // abstract class
{
	abstract void sectionA();  // abstract method
	
}

abstract class blue  // abstract class
{
	abstract void sectionB();   // abstract method
}



public class Program02   // concreate class or Sub class
{

	void add()
	{
		int x = 10;
		int y = 20;
		int total = x + y;
		System.out.println("Enter the total value:"+total);
	}
	public static void main(String[] args) 
	{
		new Program02().add();
	}

}
