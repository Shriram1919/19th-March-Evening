package methods;

public class MathOperation {

	public static void main(String[] args) {
		
		MathOperation.Add();
		MathOperation.sub();
		
		TestClass OM=new TestClass();
		OM.Mul();
		
		TestClass A=new TestClass();    
		
		A.Div();
		
	}

	    public static void Add()
	{
		int a=100;
		int b=100;
		int addition=a+b;
		
		
		System.out.println("Addition is "+addition);		
	}
        public static void sub()
        {
        	int sub;
        	int a=200;
        	int b=50;
            sub=a-b;
        	
        	System.out.println("Substraction is "+sub);
        } 
       
       
        }
        
        
	
	
	

