import java.io.IOException;
public class Hello {
     void m()throws IOException
     {
    	 throw new IOException("Device Error"); //Checked Exception
     }
     void n()throws IOException
     {
    	 m();
     } 
     void p()
     {
    	 try
    	 {
    		 n();
    	 }
    	 catch(Exception e) {System.out.println("Exception Handled");}
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hello obj= new Hello();
       obj.p();
       System.out.println("NOrmal Flow....");
       
	}

}
