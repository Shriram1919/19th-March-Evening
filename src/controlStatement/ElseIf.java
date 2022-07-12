package controlStatement;

public class ElseIf {

	public static void main(String[] args) {
		
      int Marks=80;
      if(Marks>=66)
      System.out.println("You are in Distinction");
      
      else if(Marks>=60 & Marks<66)
      System.out.println("You are in First Class");
      
      else if(Marks>=50 & Marks<60)
      System.out.println("You are in Second Class");
      
      else if (Marks>=40 & Marks<50)
      
    	  System.out.println("You are Pass");
      
      else if(Marks<40)
     System.out.println("You are Fail");
}
}