package exp_hand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tom 
{
   static Scanner sc = new Scanner(System.in);   
	
   public static void main(String[] args) 
	{
	   
	   
	   try
	   {
		   System.out.println("Enter your age : ");
		   int age = sc.nextInt();
		   
	   }
	   
	   catch(InputMismatchException A1)
	   {
		   System.out.println("Age should be numeric value");
		  Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter your age : ");
		   int age1 = sc.nextInt();
		   
		  
	   }
	   
	  
	   
	   
	   
		
	}

}
