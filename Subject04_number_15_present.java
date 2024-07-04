package arr_newva;

import java.util.Arrays;



public class Subject04_number_15_present 
{
	
	public static void main(String[] args) 
	{
		int num[] = {20, 35, 80};
		int num1 =num.length;       // To find the length
		System.out.println(num1);   
		
		System.out.println(Arrays.toString(num));  // Array represent string value
		
		int to_check_number = 15;
		for(int i=0;i<num.length;i++)
		{
			
			if(to_check_number == num[i])
			{
				System.out.println("15 is present in given array");
			}
			
		}
		
		

	}

}
