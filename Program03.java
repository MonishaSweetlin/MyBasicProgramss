package class16_abstract_concreate;

//super most class with 2 concreate method
class one       // super most class 
{
	static void mul()   // static concreate method
	{
		int x = 10;
		int y = 20;
		int total = x + y;
		System.out.println("Enter the total value:"+total);
		
	}
	
	void divide()     // non static concreate method
	{
		int a = 50;
		int b = 5;
		int sum = a + b;
		System.out.println("Enter the total value:"+sum);
	}
	
}


// Parent abstract class with 2 abstract method and 2 concreate method
abstract class two  extends one     // super class , abstract class
{
	abstract void red();   // abstract method
	
	abstract void pink();  // abstract method
	
	



    static void area_of_rectange()   // concreate method
    {
    	int l = 15;
		int b = 18;
		int total = l* b;
		System.out.println("area of rectange:"+total);
	
    }
    
    void area_of_square()      // conreate method
    {
    	int a = 37;
		int a1 = 18;
		int total = a* a1;
		System.out.println("area of square:"+total);
    }



}

// sub class with 2 concreate method

public class Program03 extends two   //sub class
{
	
	void area_of_triangle()  // concreate method
	{
    	int l = 30;
		int b = 28;
		int total = 1/2 * l* b;
		System.out.println("area of triangle:"+total);
    }
	
	static void sub()       // concreate method
	{
		
	    int a = 80;
	    int b = 30;
	    int sum = a - b;
		System.out.println("Enter the total value:"+sum);
		
	}
	
	

	public static void main(String[] args)   // main method
	{
		
		new Program03().area_of_triangle();
		sub();
		
		area_of_rectange();
		new Program03().area_of_square();
		
		new Program03().divide();
		mul();
		

	}

	
	void red() 
	{
		
		
	}

	void pink() 
	{
		
		
	}

}
