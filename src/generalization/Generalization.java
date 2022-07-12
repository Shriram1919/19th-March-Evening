package generalization;

public class Generalization {

	public static void main(String[] args) {
		
		SBI S= new SBI();
		Axis A= new Axis();
		
		System.out.println("==================");
		S.SavingAccount();
		S.FD();
		S.Loan();
		System.out.println("=======================");
		A.SavingAccount();
		A.FD();
		A.Loan();
		
		
		
	}

}
