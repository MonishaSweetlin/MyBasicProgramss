package test2_practice;

public class Start_01_constructor 
{
	Start_01_constructor()    // non parameterized constructor
	{
		System.out.println("Hello constructor");
		
	}
	
	Start_01_constructor(int a, int b)   // parameterized constructor
	{
		int sum = a+b+10;
		System.out.println("The value is:"+sum);
		
	}
	
	Start_01_constructor(double a, double b)  // parameterized constructor
	{
		double total = a+b+20.5;
		System.out.println("The value is:"+total);
	}
	
	static void animals()   //parameterized static method
	{
		System.out.println("Welcome");
	}
	
	void tiger()   //// non parameterized static method
	{
		System.out.println("Monisha");
	}
	

	public static void main(String[] args) 
	{
		 new Start_01_constructor();
	     new Start_01_constructor(10,30);
	     new Start_01_constructor(10.8, 20.7);
	     animals();
	     new Start_01_constructor().tiger();
		
		

	}

}
