package callingmethod;
import java.util.*;
public class Collection_Program 
{

	public static void main(String[] args) 
	{
	
		ArrayList a1=new ArrayList();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Monisha");
		a1.add("Abhilash");
		a1.add("Zakir");
		a1.add(32);
		a1.add(false);
		a1.add('c');
		a1.add(76543456);
		a1.add(null);
		a1.add("Manish");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);	
		System.out.println(a2.contains("Ram"));	
	System.out.println(a2.containsAll(a1));
	
	System.out.println(a2.isEmpty());
	ArrayList a3=new ArrayList();
	System.out.println(a3.isEmpty());
	
	
	
	
	
	
	}
}
