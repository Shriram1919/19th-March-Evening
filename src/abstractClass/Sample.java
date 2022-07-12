package abstractClass;

public class Sample extends Abstract{

	public static void main(String[] args) {
		
		Sample S= new Sample();
		S.test();
		S.test1();
		S.test2();
		S.sample();
		
	}

	
	@Override
	public void test()
	{
		System.out.println("This method is complete in concrete class");
	}
	
	public void sample()
	{
		System.out.println("This is sample method");
	}
	
	
	
}
