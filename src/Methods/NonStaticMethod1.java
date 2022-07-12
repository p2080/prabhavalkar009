package Methods;

public class NonStaticMethod1 {
	public static void main(String[] args)
	
	{
		NonStaticMethod1 abc = new NonStaticMethod1();//classname objectname = new classname	
		abc.display();//calling non static disaplay method form same class
		MyClass m = new MyClass(); // created object of another class 
		m.running(); // calling nonstatic method from another class
	}
	
	public void display ()
	{
		System.out.println("hi this is no static disaply method");
	}
}
