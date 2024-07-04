package class16_abstract_concreate;


abstract class program_A   // abstract class  
{
	abstract void add();  // abstract method
}




public class Program01 extends program_A // sub class   concreate class
{
	static void subtract()  // Concreate method
	{
		int c = 10;
		int d = 30;
		int sum = c + d;
		System.out.println("the total value is:"+sum);
				
	}

	public static void main(String[] args) 
	{
		Program01 P1 = new Program01();
		P1.add();
		subtract();
		
	//	new Program01().add();   

	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

}
