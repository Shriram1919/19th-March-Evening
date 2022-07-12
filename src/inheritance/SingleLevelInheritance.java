package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		
		Mother M= new Mother();  //To call Mother non static properties Object Create
		Child C= new Child();    // To call Child non static properties  Object Create
		
		M.nature();     //Calling Non static method
		Mother.care();  //Calling static method
			
        C.mobile();        //calling non static method
        Child.laptop();    //calling static method
        
        
        
        
        C.nature();   //using child object calling mother properties
        Child.care();  //using child class name calling mother properties
        
	}

}
