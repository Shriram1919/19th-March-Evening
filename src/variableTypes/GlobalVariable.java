package variableTypes;

public class GlobalVariable {

	int a=20; //global non static variable
	static int b=10;  // global Static variable
	
	
	
	public static void main(String[] args) {
		
		GlobalVariable GV= new GlobalVariable();
	
		System.out.println(GV.a); // Calling global variable from same class
		System.out.println(b);    // Calling static variable from same class
		
		Test NS= new Test();
		System.out.println("Global variable from another class "+NS.x);  // Calling Global Variable from another class 
		System.out.println("Static variable from another class "+Test.y); // Calling Static variable from another class
		
		int add=500+GV.a;   // using global variable from same class
		int add1=500+b;     // using static variable from same class
		
		int add2=500+NS.x;   // using global variable from another class
		int add3=500+Test.y;  // using static variable from another class
		
		System.out.println("Addition is "+add);
		System.out.println("Addition is "+add1);
		System.out.println("Addition is "+add2);
		System.out.println("Addition is "+add3);
		
	     GV.Test();
		 Test1();
		
	}
        public void Test()	
        {
        	int sub=a-10; 
        	int sub1=b-5;  
        	
        	System.out.println(sub);
        	System.out.println(sub1);
        }
        public static void Test1()
        {
           //int add=a+100;    not call Non static global variabl in static method
        	int add=b+100;
        	
            System.out.println(add);
        
        }
        
}

