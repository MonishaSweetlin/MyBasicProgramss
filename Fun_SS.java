package ss_string;

public class Fun_SS {

	public static void main(String[] args) 
	
	
	
	{
		
		// charAt(index)
		
		String name = "Monisha";
		char name1 = name.charAt(4);
		System.out.println(name1);
		
		// Index of Char
		
		String name3 ="Prathap";
		int name4 = name3.indexOf('a');
		System.out.println(name4);
		
       // Trim
		
		String a = "   Welcome to the world  ";
		String a1 =a.trim();
		System.out.println(a1);
		
		// Substring(start index)
		
		String name6 = "Bruno Pappa";
		String name5 = name6.substring(1);
		System.out.println(name5);
		
		// Substring(start index, end index)
		
		String a3 = name6.substring(3,8);
		System.out.println(a3);
		
		// Contains
		String b = "Roses are red";
		boolean b1 = b.contains("red");
		System.out.println(b1);
		
		
		// ends with
		String b3 = "Hello World";
		boolean b4 = b3.endsWith("l");
		System.out.println(b4);
		
		
		// equals
		
		String c1 = "red";
		String c2 = "red";
		boolean c3 = c1.equals(c2);
		System.out.println(c3);
		
		// char to array
		
		String d = "Flowerareyellow";
		char []d1 = d.toCharArray();
		
		
		for(int i=0; i<d1.length; i++)
		System.out.println(d1[i]);
		
		
		// to uppercase & lowercase
		
		String e = "monisha123";
		String e1 = e.toUpperCase();
		System.out.println(e1);
		
		// ReplaceALL 
		
		String f = "leaves are green";
		String f1 = f.replaceAll("e", "g");
		System.out.println(f1);
		
		// Matches
		
		
		
		
		
	}

}
