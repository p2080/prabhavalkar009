package Methods;

public class NonStaticMethod2 {

	public static void main(String[] args)
	{
		NonStaticMethod2 xyz = new NonStaticMethod2(); //object create in nonstatic method
		xyz.call(); // calling object of nonstatic method 
		Myclass2 p1 = new Myclass2(); //create object from diff class
		p1.display();// calling object from diff class
		
	}
	
	public void call() // nonstatic regular method
	{
		System.out.println(" hi this is my call");
	}
	

}
