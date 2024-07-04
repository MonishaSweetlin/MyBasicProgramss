package class17_interface;

interface program_01    // super most class
{
	abstract void add_01();  // abstract method
	abstract void sub_02();  // abstract method
	 
}


abstract class program_02 implements program_01   // super class
{
	abstract void add_001();   // abstract method
	abstract void sub_002();   // abstract method
	
	static void multily()     // static concreate method
	{
		int a = 20;
		int b = 35;
		int sum = a*b;
		System.out.println("Enter the value:"+sum);
	}
	
	void divide()     // non static concreate class
	{
		int c = 20;
		int d = 35;
		int sum = c/d;
		System.out.println("Enter the value:"+sum);
	}
	
	
	
}


public class Assignment extends program_02   // child class
{
	
		 void area_of_square()      //non static  conreate method
		    {
		    	int a = 37;
				int a1 = 18;
				int total = a* a1;
				System.out.println("area of square:"+total);
		    }
		 
		 static void area_of_rectange()   // static concreate method
		    {
		    	int l = 15;
				int b = 18;
				int total = l* b;
				System.out.println("area of rectange:"+total);
			
		    }
	
	
	public static void main(String[] args) 
	{
		
		new Assignment().area_of_square();
		area_of_rectange();
		
		new Assignment().divide();
		multily();
		 
			
	}

	
	public void add_01() 
	{
		
		
	}

	public void sub_02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add_001() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sub_002() {
		// TODO Auto-generated method stub
		
	}

}
