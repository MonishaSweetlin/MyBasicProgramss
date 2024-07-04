package ss_string;

public class Program_02 
{

	public static void main(String[] args) 
	{
		
		String name ="Monisha Sweetlin";
		char name1 = name.charAt(3);
		System.out.println(name1);  
		
		String name3 = "Prathap";
		int name2 = name3.indexOf('p');
		System.out.println(name2);
		
		String name4 = "Bruno Pappa";
		String name5 = name4.substring(1);
		System.out.println(name5);
		
		String a = name4.substring(3,8);
		System.out.println(a);
		
		

	}

}
