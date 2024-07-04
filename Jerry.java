package exp_hand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jerry 
{
 static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			
			System.out.println("Enter your Salary : ");
			double salary = sc.nextDouble();
			
			System.out.println("Enter your weight : ");
			int weight = sc.nextInt();
			
			System.out.println("Are you a student : ");
			boolean value = sc.nextBoolean();
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("Please fill the form again ");
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter your age : ");
				int age = sc.nextInt();
				
				System.out.println("Enter your Salary : ");
				double salary = sc.nextDouble();
				
				System.out.println("Enter your weight : ");
				int weight = sc.nextInt();
				
				System.out.println("Are you a student : ");
				boolean value = sc.nextBoolean();
			 
		}

	}

}
