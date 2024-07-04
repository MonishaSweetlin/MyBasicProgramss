package class17_interface;

// using multiple inheritance this program is created

interface college
{
	void addition();  // abstract method
	
}

class lecturer  
{
	void subtraction()   // non static class(CM)
	{
		int a = 10;
		int b = 20;
		int total = a - b;
		System.out.println("The total value is:"+ total);
		
	}
	
	static void sentence()   // static class(CM)
	{
		String a = "Hello world";
		System.out.println(a);
	}
	
}


public class Assigment_06 extends lecturer implements college   // calling two parent classes
{
   public void addition() 
   {
		
	
   }

	public static void main(String[] args) 
	{
		new Assigment_06().addition();
		new Assigment_06().subtraction();
		sentence();
		

	}

}
