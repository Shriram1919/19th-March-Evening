package interfaceStudy;

public class MyClass implements Myinterface{

	public static void main(String[] args) {
		
		MyClass M= new MyClass();
		M.test();
		M.test1();
		M.test2();
		
		
		//a=a+10; we can not update variables from interface
		System.out.println(a);
	}

	@Override
	public void test()
	{
		System.out.println("This test method completed in implementation class");
		
	}

	@Override
	public void test1() 
	{
		System.out.println("This test1 method completed in implementation class");
		
	}

	public void test2()
	{
		System.out.println("This is Myclass method");
	}
}
