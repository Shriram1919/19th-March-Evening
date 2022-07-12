package constructor;

public class EmployeeDetails {

	
	String EmpName;
	int EmpID;
	float EmpSalary;
	String  EmpDept;
	char Gender;
	

    public void EmpInfo()
    {
   	 	System.out.println("=============================");
   	    System.out.println("Employee Name is "+EmpName);  
   	    System.out.println("Employee ID is "+EmpID);
   	    System.out.println("Employee Salary is "+EmpSalary);
   	    System.out.println("Employee Deptt is "+EmpDept);
   	    System.out.println("Employee Gender is "+Gender);
    }
}
