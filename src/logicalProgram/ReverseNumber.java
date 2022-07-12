package logicalProgram;

public class ReverseNumber {

	public static void main(String[] args) {

		
		int num = 123;
		String StrNum = Integer.toString(num);
		String Rev = "";
		
		for(int i=StrNum.length()-1;i>=0;i--)
		{
			Rev=Rev+StrNum.charAt(i);
		}
		
		int RevNum = Integer.parseInt(Rev);
		
		System.out.println(RevNum);
	}
	

}
