package thisSuperKeyword;

public class This {

	int a=100;
	int b=50;
	static int c=20;
	
	public static void main(String[] args) {
		This T= new This();
		T.addition();
		
		
		
	}
	
	    public void addition()
       {
	    	int a=200;
	    	int sum=a+900;
	    	System.out.println("Addition is "+sum);
	    	
	    	int sum1=this.a+900;
	    	System.out.println("Addition is "+sum1);
	    	
	         System.out.println("Local Value is "+a);
	         System.out.println("Global value is "+this.a);
        }
	    
}
