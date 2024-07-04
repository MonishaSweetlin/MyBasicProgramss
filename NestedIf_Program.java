package nestedif_learning;

public class NestedIf_Program {

	static void program()
	{
		System.out.println("Welcome"); //main method
	}
	public static void main(String[] args)
	{
		program(); //Calling method to Main method
	int a=500;
	int b=600;
	int sum = a+b;
	String S ="apple"; //String
	
	
	   if(sum<a)  //if the parent IF is false then the child if statements blocks will not be executed
	   {
		  System.out.println("Print A"); 
	       
		      if(a<b && b<a) 
		
	           {
		         System.out.println("enter the value of A");
		         System.out.println(S); //calling string
	           }
	               else
	             {
	    	       System.out.println("hello");
	             }
	    }
	}
}


