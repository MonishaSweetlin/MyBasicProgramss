package my_program;

class red  // super most class
{
	red()   // Constructor  
	{
	int a = 10;
	int b = 20;
	int sum = a+b;
	System.out.println("The value is :"+sum);
	}
	
	void WELCOME()  // NON Static method
	{
		System.out.println("Welcome All!");
	}
	
}

class orange extends red  // super class
{
	orange(int c, int d)  // Parameterized constructor
	{
		char[] name = {'M','o','n','i'};
		System.out.println(name);
	}
	
}


public class Super_statement extends orange  // sub class

{
	Super_statement()   //constructor
	{
		super(10,20);   //parameterized super calling statement
		System.out.println("Java basic program");
	}

	public static void main(String[] args) 
	
	{
		
		Super_statement s1 = new Super_statement ();

	}

}


