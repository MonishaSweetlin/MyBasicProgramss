package exp_hand;


public class Program_102 
{

	public static void main(String[] args) 
	{
		int serialno[] = new int[1];
		serialno[0] = 10;
		serialno[1] = 20;
		serialno[2] = 20;
		
		
		
	
	
	try
	{
		serialno[3] = 20;
	}
	
	catch(IndexOutOfBoundsException E1)
	{
		System.out.println("The size exceeded");
	}
	

}
}
