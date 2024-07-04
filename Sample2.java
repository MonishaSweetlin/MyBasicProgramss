// program using conditional operators and if statements

package test1_practice;

public class Sample2 {
	
	int c = 20;  // Global variable
	
	static void task()  // static method
	{
	int a = 10;    // local variable
	int b =20;
	int a1 = 30;
	int b1 = 40;
	int sum = a+b+a1+b1;
	System.out.println(sum);
	}
	

	public static void main(String[] args) 
	{
		task();  // calling static method
		int a2 = 10;    // local variable
		int b2 =20;
		int c= 80;
		int d =90;
		int f = 100;
		
	if(a2>b2)  // if else if statement	, which ever 1st if block is true that will be executed
	{
     System.out.println("print value 1");
	}
    
	else if(f<=a2)
	{
     System.out.println("print value 2");
	}
       
    else if(d<c)
    {
     System.out.println("print value 3");
    }
    
    else
    {
    	System.out.println("hello !");
    }
  }
	
}

