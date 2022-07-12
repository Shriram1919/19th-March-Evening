package patternProgram;

public class Eg4 {

	public static void main(String[] args) {

//		*****
//		****
//		***
//		**
//		*
		int Star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=Star;j++)
			{
				System.out.print("*");
			}
			Star--;
			System.out.println();
		}
		
	}

}
