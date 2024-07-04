package arr_newva;

import java.util.Arrays;

public class Subject06_coppy1Array_ValueToOther_Array 
{

	public static void main(String[] args) 
	{
		int num1[]= {80, 30, 40, 20};
		int num2[]=new int[num1.length];
		
		
		for(int i=0;i<num1.length;i++)
		{
			num2[i]=num1[i];
		}
		
		for(int i =0;i<num1.length;i++)
		{
			System.out.println( "Enter array1 value" + num1[i]);
			
			
		}

	}

}
