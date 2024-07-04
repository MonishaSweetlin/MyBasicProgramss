package class_19;

import java.util.Scanner;

public class Program_switch 
{
/*int a = 10;
int b = 20; */
	
	
 public static void main(String[] args) 
	{
	  try(Scanner sc = new Scanner(System.in))
	    {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  
		  
		  
		  switch(1)
		  {
		  case 1:
		      int sum1 = a+b;
		      System.out.println("Addition of two Numbers:"+sum1);
		  
		  case 2:
	          int sum2 = a-b;
		      System.out.println("Subtraction of two Numbers:"+sum2);  
		      
		  case 3:
			  int sum3 = a*b;
			  System.out.println("Multiplication of two Numbers:"+sum3);
			  
		  case 4:
			  int sum4 = a/b;
			  System.out.println("Division of two Numbers:"+sum4);
		   }
		  
	    }

	}

}

