package arr_newva;
import java.util.Arrays;

public class Subject_13 
{
	static int j =0;
	public static void main(String[] args) 
	{
		int name[] = {10,29,6,18,2};
		System.out.println(name.length);
		
		int name2[] = new int [name.length];
		
		for(int i=name.length -1; i>=0; i--)
		{
			name2[i] = name[j];
			j++;
		}
		
		System.out.println(Arrays.toString(name));
		
		System.out.println(Arrays.toString(name2));
		
	}

}
