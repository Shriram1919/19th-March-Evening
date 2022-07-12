package controlStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		// If User Name is correct Then Enter Password
		//       If Password is correct Then Log In Success
	    //         Else Enter Password  
	    // Else Enter Correct User Name 
	
	
	    String UN="Shriram";
	    String Pass="Shriram@123";
	    
	    if(UN=="Shriram")
	    {
	            System.out.println("Enter Password");
	    
	             if(Pass=="Shriram@123")
	             {
	        	      System.out.println("Log in Success"); 
	             }
	             else
	             {
	        	      System.out.println("Enter Correct Password");  
	             }
	    }
	         else 
	        {
	        	System.out.println("Enter Correct User Name"); 
	         }
	    }
	
		
	}
	
