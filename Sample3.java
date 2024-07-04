package test1_practice;

public class Sample3 
{
	
 Sample3()
 {
	System.out.println("this is constructor");
 }



     void add(int a)  //not static method
     {
	int sum = a+6;
	System.out.println(sum);
     }
	
     void sub(double a,double b) // non static method
     {
    	 double sum = a - b - 10.8;
    	 System.out.println(sum);
     }
     
     
   public static void main(String[] args) 
	{
    	 Sample3 s1 = new Sample3();  // calling not static method by craeting object and calling constructor 
	s1.add(10);
	
	
	
	
	
	int a = 10;
	int b = 20;
	if(a<b && b>a)  // And operator
	{
	System.out.println("print value 1");
	}
	
	if(!(a>b && b<a)) // not operator
	{
	System.out.println("print value 1");
	}
	
	
	
	}

}
