package statements_sample_program;

public class ifelse_block {
	
	public static void user()
	{
	System.out.println("HELLO USER:)");
	}

	public static void main(String[] args) {
		user();
		
    int age =5;
    double weight = 60.5;
    
      if(age>=18)
      {
    	  System.out.println("He/She can vote! ");
      }
      
      else if(age<18)
      {
    	  System.out.println("He/She cannot vote!");
      }
      else if(age>=21)
      {
    	  System.out.println("women age to marriage");
	  }
      else if(age<21)
      {
    	  System.out.println("women age is under marriage");
      }
      else if(weight>80)
      {
    	  System.out.println("Person needs to go GYM !");
      }
	}


}
