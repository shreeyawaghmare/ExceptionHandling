
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
			  int arr[];
			  arr=new int[2];
			  arr[0]=23;
			  arr[1]=23;
			  System.out.println("Element of array at this index is "+arr[7]);
			  }
			  catch(Exception ex){
			  ex.printStackTrace();
			  }
	}

}
