package string;


public class StringMethod {

	public static void main(String[] args) {
		
		
		String name="Velocity";
		
		//length() method use
		
		System.out.println(name.length());
		
		int lengthofString=name.length();
		System.out.println(lengthofString);
		
		
		//toUpperCase() method use
		
			System.out.println(name);
			System.out.println(name.toUpperCase());
			
			String m=name.toUpperCase();
			System.out.println(m);
			
			
			//toLowerCase() method use
			
			System.out.println(m.toLowerCase());
			
			String n=m.toLowerCase();
			System.out.println(n);
			
			
			//equals() method use
			
			
			String a="Velocity";
			String b="Velocity";
			String c=new String("Velocity");
			String d=new String("Velocity");
			String e=new String("VELOCITY");
			
			// === compares memory locations of two operands
			// equals method compare character sequence of two objects
			
			
			System.out.println(a==b);
			System.out.println(c==d);
			System.out.println("=================");
			System.out.println(a.equals(b));
			System.out.println(a.equals(c));
			System.out.println(a.equals(d));
			System.out.println(a.equals(e));
			
			boolean result=a.equals(c);     //checking character sequence along with case sensitivity
	
			System.out.println(result);
			System.out.println("=================");	
			
			
			//equalsIgnoreCase() method use
			
		String city="Pune";
		String locality="Pune";
		String dist="pune";
		
		System.out.println(city.equalsIgnoreCase(dist));
		System.out.println(city.equals(dist));
		System.out.println(city.equalsIgnoreCase(locality));
		System.out.println("=================");
		
		
		//contains() method use
		
		String K="Katraj";
		System.out.println(K.contains("Ka"));
		System.out.println(K.contains("ar"));
		System.out.println("=================");
		
		
		//isEmpty() method use
		
		String p="Test";
		String q="  ";
		//String r=null;
		String s="";
		
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(s.isEmpty());
		//System.out.println(r.isEmpty());
		System.out.println("=================");	
			
		System.out.println(p.isBlank());
		System.out.println(q.isBlank());
		System.out.println(s.isBlank());
		System.out.println("=================");	
		
		
		// charAt method use
		
		
		String country="INDIA";
		
		System.out.println(country.charAt(2));
		
		char C=country.charAt(3);
		System.out.println(C);
		System.out.println("=================");	
		
		
		//endsWith method use
		
		System.out.println(country.endsWith("IA"));
	    System.out.println(country.endsWith("IND"));
	    System.out.println(country.endsWith("A"));
	    System.out.println("=================");	
		
	    
	  //startsWith method use
	    
	    System.out.println(country.startsWith("IND"));
	    System.out.println(country.startsWith("DIA"));
	    System.out.println(country.startsWith("I"));
	    
	    System.out.println(country.startsWith("I", 3));
	    System.out.println(country.startsWith("A", 4));
	    System.out.println("=================");		
	    
	    
	  //substring method use
	    
	    String Testing="VELOCITY CORPOTARE TRAINING INSTITUTE";
	    
	    System.out.println(Testing.substring(8));
	    
	    String TestString=Testing.substring(4);
	    System.out.println(TestString);
	    
        System.out.println(TestString.substring(4, 20));
        System.out.println("=================");	
        
      //concat method study
        
        String u="Pune ";
        String f="City";
        
        System.out.println(u.concat(f));
        System.out.println("================="); 
        
        
        
      //indexOf method use
        
        String state ="Maharashtra";
        
        System.out.println(state.indexOf('a'));
        System.out.println("================="); 
        
        
      //replace method use
        
        String Tal="Pune Mumbai Nagpur";
        System.out.println(Tal.replace('e', 'w'));
        
	}   
	}

