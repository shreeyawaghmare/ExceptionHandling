
public class Throw {
   static void validate(int age)
   {
	   if(age<18)
		   throw new ArithmeticException("Not Valid");
	   else
		   System.out.println("Welcome to Vote");
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  validate(13);
      }
      catch(Exception ex)
      {
      System.out.println("Rest of the code...");
      
	}

}
}
