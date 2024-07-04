package my_program;

class Canada
{
	Canada()
	{
		System.out.println("My sister stays in Canada");
	}
	
}

class India extends Canada
{
	India()
	{
		System.out.println("I Love India");
	}
}

public class Country extends India
{
	Country()
	{
		
		
		System.out.println("All countries are equal");
	}
	
	void addition()   // Non static method
	{
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Total value is :"+sum);
	}

	
	public static void main(String[] args)
	{
		Country C1 = new Country();
		C1.addition();
	}

}
