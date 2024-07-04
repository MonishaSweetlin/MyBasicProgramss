package test03_practice;

interface tom
{
	void add();
}

interface black
{
	void red();
	void sub();
}

public class White implements black, tom
{
	
	void addition()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		White W = new White();
		W.addition();

	}

	@Override
	public void add() 
	{
		
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
