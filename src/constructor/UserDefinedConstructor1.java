package constructor;

  public class UserDefinedConstructor1 {
	int a;
	int b;
	
	public UserDefinedConstructor1()
	{
		a=40;
		b=20;
				
	}
	
	public static void main(String[] args) {
		
		UserDefinedConstructor1 A1= new UserDefinedConstructor1();
		A1.Add();
		A1.sub();
		
				
	}

	public void Add()
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		}
	
	public void sub()
	{
		int subs=a-b;
		System.out.println("Substraction is "+subs);

		
	}
}

