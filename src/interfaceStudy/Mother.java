package interfaceStudy;

public interface Mother {
	
	void receipe();
	void Care();
	
	default void Money()
	{
		System.out.println("Mothers Money");
	}
    static void test() 
    {
    System.out.println("Mothers test");	
    }
}
