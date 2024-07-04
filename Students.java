package test2_practice;


class pencil
{
	void orange()
	{
	int c = 35;
	int d = 40;
	}
}

class rubber extends pencil

{  
	rubber()
	{
		String s = "Monisha";
		System.out.println(s);
		}
	
	
}

public class Students extends rubber

{
	Students()
	{
		super();
		System.out.println("Hello!");
		
		
	}
	static int a= 10;   // Global Variable
	static int b = 20;
	
	

	public static void main(String[] args) 
	{
		Students s1 = new Students();
		
		int sum = a + b;
		System.out.println(sum);
	
		



	}



	
}
