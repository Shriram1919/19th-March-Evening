package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//implicit casting
		
		int a=5;    //lower data type information
		System.out.println(a);
		
		double b=a;    //converted into higher data type information
		System.out.println(b);
		
		
		//explicit casting
		
		double z=10.5;     //higher data type information 
		System.out.println(z);
		
		int y=(int)z;      //converted into lower data type information
		System.out.println(y);
		
	}
	
	
	

}
