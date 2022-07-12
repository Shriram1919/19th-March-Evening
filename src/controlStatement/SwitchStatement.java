package controlStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
	
		// Year 1 --- Welcome to 1st Year Engineering
		// Year 2 ----Welcome to 2nd Year Engineering
		// Year 3 ----Welcome to 3rd Year Engineering
		// Year 4 ----Welcome to 4th Year Engineering
		
		int Year=4;
		switch (Year)
		{
		case 1: System.out.println("Welcome to 1st Year Engineering");
		break;
		case 2: System.out.println("Welcome to 2nd Year Engineering");
		break;
		case 3: System.out.println("Welcome to 3rd Year Engineering");
		break;
		case 4: System.out.println("Welcome to 4th Year Engineering");
        break;
		default:System.out.println("Please Enter Year Between 1 to 4");
	    break;
		}
		
	}

}
