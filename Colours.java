package sample2_inheritance;


class yellow  // super most class
{
   void add()	// Non static
   {
	int a = 10;
	int b = 20;
	int sum = a + b;
	System.out.println("Total sum value is"+sum);
   }
   
   
}

class red extends yellow  // super class
{
	static void name()  // static
	{
	char a ='M';
	char b ='o';
	char c ='n';
	char d ='i';
	char[] name = {'M','o','n','i'};
	System.out.println(name);
	}
	
}


public class Colours extends red   // sub class
{
	 void sub()	// Non static
	   {
		int a = 10;
		int b = 30;
		int sub = a - b;
		System.out.println("Total sum value is"+sub);
	   }

  public static void main(String[] args) 
	
	{
	Colours c1 = new Colours();  // In inheritance for non static method object to be created from sub class
				c1.sub();
				c1.add();
				name();
	  
	  

	}

}

