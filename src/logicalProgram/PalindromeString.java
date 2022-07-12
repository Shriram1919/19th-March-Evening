package logicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter string");
		String Org = sc.next();
		String Rev ="";
		
		for(int i=Org.length()-1;i>=0;i--)
		{
			Rev=Rev+Org.charAt(i);
		}
		System.out.println("Original String is "+Org);
		System.out.println("Rev String is "+Rev);
	
		if(Org.equals(Rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
			
		}
	
	
	}
	
}
