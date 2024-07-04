package arr_newva;

import java.util.Arrays;

public class Subject07_Check_two_arrays_equal 
{

	public static void main(String[] args) 
	{
		int arr1[] = {10, 20, 30, 40};
		String b1 = Arrays.toString(arr1);
		System.out.println("Array 1--->" +b1);
	
		int arr2[] = {30, 45, 50, 80};
		String c1 = Arrays.toString(arr2);
		System.out.println("Array 2--->"+c1);
		
		boolean a1 = Arrays.equals(arr1, arr2);
		if(a1)
		{
			System.out.println("The given arrays are equal");
			
		}
		else
		{
			System.out.println("The given arrays 1 & 2 are not equal");
		}
	
		
		
		
		}

	}


