package AccessSpecifier;

public class Velocity {

	public static void main(String[] args) 
	{
     Velocity v = new Velocity();
     
     System.out.println("==================================");
     v.test1();//calling private method--(visible only within class)
     v.test2();// calling default method--(visible only within package)
     v.test3();// calling protected method--(visible only within package)>>>Inheritance provide out of package
     v.test4();// calling public method--(visible througout project)
 	 System.out.println("==================================");	
	}
	
	private void test1()// private member
	{
		System.out.println("i am private method test1");
	}
	
	void test2()// default member
	{
		System.out.println("i am default method test2");
	}
	
	protected void test3()
	{
		System.out.println("i am protected method test3");
	}
	
	public void test4()
	{
		System.out.println("i am public method test4");
	}

}
