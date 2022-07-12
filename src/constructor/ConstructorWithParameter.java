package constructor;

public class ConstructorWithParameter {

	int a;
	int b;
	
	public ConstructorWithParameter()
	{
	 a=50;
	 b=10;	
	}
	public ConstructorWithParameter(int x)
	{
		a=x;
		
	}
	public ConstructorWithParameter(int x,int y)
	{
		a=x;
		b=y;
			
		
	}
	
	public static void main(String[] args) {
		
        ConstructorWithParameter K= new ConstructorWithParameter(100);
        K.A2();
        
        ConstructorWithParameter M= new ConstructorWithParameter(100,200);
        M.A2();
        
	}

	public void A2()
	{
		int sum=a+b;
		System.out.println(sum);
	}
}
