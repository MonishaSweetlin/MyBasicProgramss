package arr_newva;

import java.util.Arrays;

public class Subject08_Reverse_array 
{
     static int j =0;
	public static void main(String[] args) 
	{
		int num1[] = {1,2,3,4,5};
		
		int num2[]=new int [num1.length];
		
		for(int i =num1.length-1; i>=0; i--)
		{
			num2[i]  = num1[j];
			j++;
		}
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));

	}

}
