package accessSpecifiers;

public class Private {

	public static void main(String[] args) {
		
		Private P= new Private();
		P.test();
	    P.test1();
	    P.test2();
	    test3();
				
		
		

	}
          private void test()    //only within class not access from another classes
          {
        	  System.out.println("This is private test method");
          }
          
          void test1()    //only within package
          {
        	  System.out.println("This is default tetst1 method");
          }
          
          protected void test2()     //only within package  inheritance-----another package
          {
        	System.out.println("This is protected test2 method");  
          }
          
          public static void test3()     // project	
          {
        	  System.out.println("This is public void test3 method");
          }
}
