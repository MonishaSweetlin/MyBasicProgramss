package arr_newva;

public class Subject09_string_prgm 
{

	public static void main(String[] args) 
	{
		String a1 = "Monisha";
		System.out.println(a1.replaceAll("a", ""));
		
		// Removed letter "A" from my name
		
		
		String a2 = "Monisha Sweetlin";
		System.out.println(a2.replaceAll("a", "p"));
		
		// replaced letter "A" with "p" Using replaceall string function
		
		String a3 = "Monisha Prathap";
		System.out.println(a3.replaceAll(" ", ""));
		
		// Removed the space inbetween the string
		
		String a4 = "MOnisha";
		System.out.println(a4.replaceAll("[A-Z]", ""));
		
		// iN GIVEN STRING REMOVED THE CAPITAL LETTERS

	}

}
