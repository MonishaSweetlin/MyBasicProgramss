
package callingmethod;
import java.util.ArrayList;
public class Collection1_program {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Manish");
		a1.add("Amrutha");
		a1.add("Monisha");
		a1.add("Abhilash");
		a1.add("Zakir");
		System.out.println("The size of a1 is-> "+a1.size());
		System.out.println("Before Removal-> "+a1);
		a1.remove("Manish");
		System.out.println("The size of a1 after removal of 1 object is-> "+a1.size());
		System.out.println("After Removal-> "+a1);

	System.out.println("-------------------------");	
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Surya");
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a2.size());
		
		ArrayList a3=new ArrayList();
		a3.add("1");
		a3.add("90");
		a3.add("99");
		a3.add("89");
		a3.add("76");
		
		System.out.println("before clearing-> "+ a3);
		a3.clear();
		System.out.println("After clearing-> "+ a3);

		
	}

}
