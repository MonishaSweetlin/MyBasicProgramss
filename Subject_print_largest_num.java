package arr_newva;

public class Subject_print_largest_num 
{

	public static void main(String[] args) 
	{
		int number[] = {10, 50, 40, 100};
		
		int maximum_of_number =0;
		for(int i =0;i<number.length;i++)
		{
		 if(number[i]>maximum_of_number)
		 {
			 maximum_of_number=number[i];
		 }
		}
System.out.println(maximum_of_number);
	}

}
