package methods;

public class StaticMethodStudy {

	
	public static void main(String[] args) {
	   
		myMethod();   // Calling static regular method from same class   // Call with method name 
        myMethod1();
        
        Testing.demo();  // Calling static regular method from another class    // Call with ClassName.Method Name
        Testing.calculation();
       
	}
	

	public static void myMethod()
	{
		
	System.out.println("Hi This is my method");	
		
	}
	
	public static void myMethod1()
	{
		System.out.println("Hi This is mymethod1");
		
	}
	
}

