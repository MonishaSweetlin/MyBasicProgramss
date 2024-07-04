package test2_practice;

public class Program_const 
{
	Program_const(int a, int f)
	{
		
		int sum = 22 + a + f;
		System.out.println("enter the value:"+sum);
		
		
	}
	
	Program_const(double d, double g)
	{
		this(10, 20);
		double sum = 16.5 - d-g;
		System.out.println("enter the value:"+sum);
	}
	
	

  public static void main(String[] args) 
	{
	  Program_const p1 = new Program_const(7,10);
	  new Program_const(8.5, 10.5);
		
	  

	}

}
