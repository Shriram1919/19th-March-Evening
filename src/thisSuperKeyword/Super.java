package thisSuperKeyword;

public class Super extends This {

	
	int a=500;
	
	public static void main(String[] args) {
		
		Super S=new Super();
		S.sub();
	}

	
	public void sub()
	{
		int a=800;
		int sub=a-70;
		System.out.println("Subtraction is "+sub);
		
		
		int sub1=this.a-70;
		System.out.println("Subtractiuon is "+sub1);
		
		
		int sub2=super.a-70;
		System.out.println("Subtraction is "+sub2);
	}
}
