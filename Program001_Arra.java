package ss_string;

public class Program001_Arra {

	public static void main(String[] args) 
	
	{
		int [] serialnumber = new int[7];
		serialnumber[0] = 40;
		serialnumber[1] = 47;
		serialnumber[2] = 40;
		
		
		try
		{
			serialnumber[3] = 40;
			System.out.println();
		}
		
		catch(IndexOutOfBoundsException Ex1)
		{
			System.out.println("Something went wrong try again please");
		}
		
	}

}
