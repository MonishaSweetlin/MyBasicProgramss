package sample2_inheritance;

public class Program extends voting
{
	
	static void print()
	{
		System.out.println("Hello ");
	}
	
	
	
	
}

	class byke
	{
	   void name()
	   {
		  char []name= {'P','U','L','S','A','R'};
		  System.out.println("Our bike is :"+name);
				  
	   }
	}
	
	class voting extends byke
	{
		void looping()
		{
		    for (int i = 10; i>18; i++)
		    {
			System.out.println("Age of voting is above 18");
		    }
		}
	
	
		
	public static void main(String[] args) 
	{
		
		Program p1 = new Program();
		
		p1.looping();
		p1.name();
		
		
		
		
		
	}

}

