package methods;

public class NonStaticMethodStudy {

	public static void main(String[] args) {
		
	
		// ClassName ObjectName= New ClassName       // Creating Object
		
		// ObjectName.MethodName();                   // Call Non Static Method From Same Class Using Object
		
		NonStaticMethodStudy NSM= new NonStaticMethodStudy();       // Creating Object
		NSM.Name();
		
		NonStaticMethodStudy T= new NonStaticMethodStudy();    
		T.display();                                              // Calling Non Static Method From Same Class
		
		
		TestClass A= new TestClass();                            // Calling Non Static Method From Another Class
		A.Running();
		
	    TestClass S= new TestClass();
	    S.Number();
		
	}

	public void Name()
	{
		System.out.println("Hi This is non static Name Method");
	}
	
	public void display()
	{
		System.out.println("Hi This is non static display Method");
	}
}
