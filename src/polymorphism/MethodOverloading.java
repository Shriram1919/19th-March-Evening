package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading M= new MethodOverloading();
		M.add();
		M.add(100, 50);
		M.add(600, 400, 200);
		
	}

	
	
	public void add()
	{
		int a=20;
		int b=10;
	    int sum=a+b;
	    System.out.println("sum is "+sum);
	}
	
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
     }
	
	public void add(int a,int b, int c)
	{
		int sum=a+b+c;
		System.out.println("Sum is "+sum);
	}
	
	
}
