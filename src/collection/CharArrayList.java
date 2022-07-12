package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CharArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> A = new ArrayList<>();
		
		A.add('A');
		A.add('B');
		A.add('C');
		A.add('D');
		A.add('E');

		
		Iterator I = A.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		
		
		
		
		
		
		
		
	}

	
	
	
}
