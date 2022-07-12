package constructor;

public class UserDefinedConstructor {            // Without Parameter Constructor

	public UserDefinedConstructor()
	{
		int a=100;
		int b=200;
		System.out.println("Value of a is "+a);
	    System.out.println("Value of b is "+b);
		
	}
	public static void main(String[] args) {
		
        UserDefinedConstructor A= new UserDefinedConstructor();
         A.Test();
	}

	
	public void Test() {
		
		System.out.println("Hi This is User Defined Constructor");
		
		
	}
}
