package interfaceStudy;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		
		Son S= new Son();
		S.receipe();
		S.Care();
		S.love();
		S.natutre();
		Father.test();
		Mother.test();
				
		
		
	}

	@Override
	public void receipe() {
		System.out.println("Mother Receipe completed in son class");
		
	}

	@Override
	public void Care() {
		System.out.println("Mothers Care method completed in son class");
		
	}

	@Override
	public void love() {
		System.out.println("Fathers love method completed in son class");
		
	}

	@Override
	public void natutre() {
		System.out.println("Fathers nature method completed in son class");
		
	}

	@Override
	public void Money() {
		
		System.out.println("Son Money");
		Father.super.Money();
		Mother.super.Money();
	}

}
