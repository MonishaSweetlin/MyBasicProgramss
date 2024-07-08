package class4;

// WAP with equalsIgnoreCase, endswith, isEmpty & Repeat in String Class

public class Assignment_98 
{

	private static final String[][] String = null;

	public static void main(String[] args) 
	{
		String name1 = "Monisha Sweetlin  ";
		String name2 = "Monisha Sweetlin";
		String name3 = "";  // Empty string
		boolean b1 = name2.equalsIgnoreCase("lin");   // It is used to campare two strings
		System.out.println(b1);
		
		// endswith
		boolean b2 = name1.endsWith("p");  // Checks whether the string ends with a particular character
		System.out.println(b2);
		
		
		//Empty
		boolean b3 = name3.isEmpty();
		System.out.println(b3);
		
		System.out.println(name2.isEmpty());
		
		//Repeat
		System.out.println(name1.repeat(5));
		char[] name5 = name1.toCharArray();   // Converting string to array
		System.out.println(name5);
		
		
		
		/*String[] name = String[2];
		name[0]="Monisha"; 
		name[1]="Nisha" */
		
		
	}

}
