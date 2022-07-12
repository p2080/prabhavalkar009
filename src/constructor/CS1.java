package constructor;

public class CS1 {

	String City = "pune";// variable declaration
	
	String Name; // variable declaration
	
	public CS1() // user defined constructor
	
	{
		Name = "Velocity"; //used initialization variable name 
		
	}

	public static void main(String[] args) 
	{
		CS1 c2 = new CS1();
	    c2.display1();

		display10();
		
		
	}
	public void display1()
	
	{
		System.out.println("i am non static void method");
		System.out.println("my city name is "+City );
		System.out.println("My name is "+Name);
		
	}
	 
	public static void display10()
	{
		System.out.println("i am static dispaly1 method ");
	}
	

}
