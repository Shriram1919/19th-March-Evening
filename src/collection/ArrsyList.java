package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrsyList {

	public static void main(String[] args) {
		
		
		ArrayList AL= new ArrayList();
		
		AL.add("Velocity");
		AL.add("null");
		AL.add("Velocity");
		AL.add("null");
		AL.add('A');
		AL.add(100);
		AL.add(100.50);
		AL.add("true");
		
		
//		
//		System.out.println(AL);
//		System.out.println(AL.size());
//		System.out.println(AL.isEmpty());
//		System.out.println(AL.contains(100));
//		System.out.println(AL.get(4));
//		System.out.println(AL.indexOf('A'));
//		System.out.println(AL.remove(2));
//		System.out.println(AL);
//	    AL.add(2, "Pune");
//	    System.out.println(AL);
	    
	    
//	    for(int i=0;i<=AL.size()-1;i++)       //Using for loop
//	    {
//	    	System.out.println(AL.get(i));
//	    }
		
//		Iterator It = AL.iterator();            //Using Iterator
//		
//		while(It.hasNext())
//		{
//			System.out.println(It.next());
//		}

		
//		ListIterator Lit =AL.listIterator();     //Using ListIterator
//		
//		while(Lit.hasNext())
//		{
//			System.out.println(Lit.next());
//		}
		
													
		
		
		for(Object A:AL)                        //Using ForEach Loop
		{
			System.out.println(A);
		}
		
		
		
	}

}
