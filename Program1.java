package sampleNew;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) 
	
	// Program area of rectangle l * b
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the value of Length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter the value of Breath : ");
		int b = sc.nextInt();
		
		int sum = l * b;
		System.out.println("Final output : "+sum);
		
		
			
		}
		
	}

}
