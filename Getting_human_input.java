package java_math;

import java.util.Scanner;

public class Getting_human_input 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a +b;
			System.out.println("The total value of A and B is:"+sum);
			
		}

	}

	

}
