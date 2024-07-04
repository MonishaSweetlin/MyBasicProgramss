package arr_newva;
import java.util.Arrays ;
import java.util.Scanner;

public class Subject_13_01 {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter lenth of the element");
	    n = sc.nextInt();
		
		int num[] = new int[10];
		System.out.println("The elements are");
		for(int i = 0 ; i<n; i++)
		{
			num[i] = sc.nextInt();
		}

	}

}
