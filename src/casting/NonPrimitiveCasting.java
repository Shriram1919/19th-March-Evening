package casting;

public class NonPrimitiveCasting {

	public static void main(String[] args) {
		
		Son S= new Son ();
		S.bike();
		S.car();
		S.Degree();
		
		Father F= new Son();   //creating object of subclass and giving superclass reference

		F.bike();
		F.car();
	//	F.Degree();  // not eligible for casting as its not common/ superclass method


	}

}
