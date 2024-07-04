package sampleNew;

import java.util.Scanner;

public class Program2 
{
// Circumference of circle program formula = 2*pi*r or 
	
	static double pi = 3.14;
	
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the radius of circle : ");
		double r = sc.nextDouble();
		
		
		double circumference = 2*pi*r;
		System.out.println("circumference of circle is : "+circumference );
		}
	}

}
