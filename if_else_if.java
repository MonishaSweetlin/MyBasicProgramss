package java_statements_two;

public class if_else_if {
	
	static void one()
	{
		System.out.println("hello people");
		
	}

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int c =40;
		int d =33;
		int sum = a+b;
		System.out.println(sum);
		one();
		
		if(a>b)
		{
System.out.println("then print this a is greater than b");
	}

		else if(sum>d)
		{
			System.out.println("statement is considers as true");
		}
		
		
		else if(a<c)
		{
			System.out.println("then print this statement");
		}
		else if(a==d)
		{
			System.out.println("the colour is pink");
		}
		else if(c>sum)
		{
			System.out.println("print the value");
		}
		
	}
		
}

