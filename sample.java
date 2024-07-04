package global_var;

public class sample {
	
	static void program()
	{
		String name="monisha";
		System.out.println(name);
	}
    int a = 10;
    int b = 20;
    char p = 'M';
    int age =60;
    
    
	public static void main(String[] args) 
	{
	program();
	
	sample s1=new sample();
	System.out.println(s1.p);
	System.out.println();
	
	sample s2 = new sample();
	s2.age=70;
	System.out.println(s2.age);


	}

}
