package constructor01;

public class Sample_constructor_program 
{
	Sample_constructor_program(int a)  //Constructor
	{
	System.out.println("This is a Constructor");
	int sum = a + 10;
	System.out.println(sum);
	}
	
	Sample_constructor_program(int a, int b)
	{
		int sum = a + b + 20;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		new Sample_constructor_program(20,20);  //when we have arguments this is the other way of calling non static method or object
		new Sample_constructor_program(50);
		
		
	}

}
