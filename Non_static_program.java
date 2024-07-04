package nonstatic01;

public class Non_static_program {
	
	static void sample1()
	{
		System.out.println("this is static method");
	}
	
	void sample2()
	{
		System.out.println("This is Non static method");
	}
	
	void sample3()
	{
		System.out.println("This is also static method");
	}

	public static void main(String[] args) 
	{
	
		int a = 10;
	    int b= 30;
	    int sum = a +b;
	
	    String A = "Helllo";
	    System.out.println(A + sum);
	
	    Non_static_program n1=new Non_static_program();
	    n1.sample2();
	
	    Non_static_program n2=new Non_static_program();
	    n2.sample3();
	
	sample1();
	
	
	}

}
