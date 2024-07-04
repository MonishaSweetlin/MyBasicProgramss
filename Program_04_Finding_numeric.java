  
package ss_string;

import java.util.Arrays;

public class Program_04_Finding_numeric 
{
	static int count_of_digit=0;


	public static void main(String[] args) 
	{
		String name = "Monisha Sweetlin Raj";
		Boolean a1 = name.contains("rishi");      // Contains String : It will check the given string contain the name or not using boolean datatype
		System.out.println(a1);
		
		
		String name1 = "MONISHA123";
		char b1[] = name1.toCharArray();                         //1.  converts the string to array "toCharArray"
		System.out.println(Arrays.toString(b1));                 //2. Return type to be in string of content array
		
		
		
	    for (int i=0; i<name1.length(); i++)
	    {
	    	boolean c1 =Character.isDigit(b1[i]);
	    	System.out.println(c1);
	    
	    
	    
	    if(c1==true)
		{
			count_of_digit++;
		}

    }
	    System.out.println("The number of digits in the given string are -> "+count_of_digit);

  }
}
