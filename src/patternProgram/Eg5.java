package patternProgram;

public class Eg5 {

	public static void main(String[] args) {
//		     *
//		    **
//		   ***
//		  ****
//	     *****
		
		int Star=1;
		int Space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=Space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=Star;j++)
			{
				System.out.print("*");			
		    }
		Star++;
		Space--;
		System.out.println();
		
		
		
		}	
	}
	

}
