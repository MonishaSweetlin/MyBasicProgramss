package method_constructor_overloading;

public class SampleMC 
{
	static void addition(int a)  // Method
	{
		int sum = a+10;
		System.out.println(sum);
	}
	
	SampleMC(int a, int b) // Constructor
	{
		int total =a*b+ 10;
		System.out.println(total);
	}
	
	public static void multiplication(int a, int b) // Method
	{
		int sum = a * b* 5;
		System.out.println(sum);
	}
	
	SampleMC(int a) // Constructor
	{
	int sub = 10 - 7;
	System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		addition(20);  //30
		new SampleMC(10,10);  // 110
		multiplication(20,20);
		new SampleMC(10);
		

	}

}
