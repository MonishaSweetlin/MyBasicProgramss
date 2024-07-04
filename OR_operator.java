package logical_operators;

public class OR_operator {

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 10;
		int c = 30;
		byte d = 15;
		int e = 40;
		int f = 50;
		
		if(a>b && c>a) 
		{
			System.out.println("statement 1");
		}
		if(a>b || e<a)
		{
			System.out.println("Statement 2");
		}
		if(f>d || b>a)
		{
			System.out.println("Statement 3");
		}
		if(!(d>e && e>f)) 
		{
			System.out.println("Statement 4");
		}
		if(b>f && e>d)
		{
			System.out.println("Statement 5");
		}
		

	}
	

}

	
