package non_static;

public class Calling_nonstatic_method 
{
	static void multiply() //static method
   {
		int b = 10;
		int c = 20;
		int sum = b*c;
		System.out.println(sum);
	}
	
	void sample(int a) // non static
	{
	int a1 = 5;
	int b1 = 10;
	int sum = a+b1;
	System.out.println(sum);
	
	
	}

	public void sample2(int i ) // non static
	{
		byte m = 10;
		byte n = 30;
		int sum = i + m+n;
		
	    System.out.println(sum);
	}
	

	public static void main(String[] args) // Main method
	{
	Calling_nonstatic_method p1 = new Calling_nonstatic_method();	
    p1.sample(90);
    
    multiply();
    Calling_nonstatic_method p2 = new Calling_nonstatic_method();	
    p2.sample2(50);
	}

}
