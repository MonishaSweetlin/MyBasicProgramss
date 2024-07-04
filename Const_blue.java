package test03_practice;

public class Const_blue 
{
 
	Const_blue()
	{
	 int a = 10;
	 int b = 40;
	 if(b>a)
	 {
		System.out.println("Then the value is B : 40"); 
	 }
	  
	}
	
	Const_blue(int a)
	{
		this();    // This calling statement is used to call parent class constructor within same class 
		int b = 20;
		int c = a + 20;
		System.out.println(c);
				
	}
	
	class cake
	{
		cake()
		{
			int a = 35;
			int b = 45;
			int c = a*b;
			System.out.println(c);
		}
	}
	
	
	class chocolate
	{
		chocolate()
		{
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		new Const_blue(35);
		
		
		
		
	}

	

	

}
