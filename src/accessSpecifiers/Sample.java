package accessSpecifiers;

public class Sample {

	public static void main(String[] args) {
		
		
		Private Po= new Private();
	      //	Po.test()  private method can not call another class
		
		Po.test1();           //default method
		Po.test2();          //protected method
	    Private.test3();     //public method
	}

}
