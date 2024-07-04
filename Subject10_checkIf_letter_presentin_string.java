package arr_newva;

public class Subject10_checkIf_letter_presentin_string 
{

	public static void main(String[] args) 
	{
		String a1 = "Automation Testing";
		System.out.println(a1.matches("(.*)n(.*)"));

		
		String a2 = "sahanh";
		System.out.println(a2.matches(".a(.*).h"));
	}

}
