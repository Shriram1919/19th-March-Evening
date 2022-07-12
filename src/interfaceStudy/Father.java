package interfaceStudy;

public interface Father {

	
	void love();
	void natutre();
	
	 default void Money()
	{
		System.out.println("Fathers money");
		
	}
	 
	 static void test()
	 {
		 System.out.println("Fathers test");
	 }
}

