package arr_newva;


// Finding the average of numbers

public class Subject03 
{
	static int sum = 0;
	static double average = 0;

	public static void main(String[] args) 
	
	{
		int[] total = {10, 20, 50, 80};
		System.out.println(total.length);   // To find the total index
		
		
		
		for(int i = 0; i<total.length; i++)
		{
			
			sum = sum+total[i];
		}
		System.out.println(sum);
		
		average=sum/total.length;
		System.out.println(average);
		
	}

}
