package generalization;

public class SBI implements RBI {

	@Override
	public void SavingAccount() {
		System.out.println("SBI Saving Account ");
		
	}

	@Override
	public void FD() {
		System.out.println("SBI FD");
		
	}

	@Override
	public void Loan() {
		
		System.out.println("SBI Loan");
	}

}
