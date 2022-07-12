package methods;

public class UniversityResult {

	public static void main(String[] args) {   
	
		UniversityResult.StudentDetails();
	
		UniversityResult.StudentDetails1("Shriram", 50, 'A', 200.20f);
		UniversityResult.StudentDetails1("Tushar", 100, 'B', 400.10f);
		
	}
        public static void StudentDetails()   // Method without parameter
        {
        	String A="Shriram";
        	int RollNo=50;
        	char Grade='A';
        	float Marks=510.60f;
        	
        	System.out.println("==============================");
        	System.out.println("Student Name is "+A);
        	System.out.println("Student ROll No is "+RollNo);
        	System.out.println("Student Grade is "+Grade);
        	System.out.println("Student Marks is "+Marks);
        	System.out.println("================================");
        }
	    
	        public static void StudentDetails1(String StudentName,int RollNo,char Grade,float Marks )
	        {
	        	
	        	System.out.println("================================");
	        	System.out.println("Student Name is "+StudentName);
	        	System.out.println("Student Roll No is  "+RollNo);
	        	System.out.println("Student Grade is "+Grade);
	            System.out.println("Student Marks is "+Marks);
	        	System.out.println("================================");
	        	
	        	
	        }
        
        
}
