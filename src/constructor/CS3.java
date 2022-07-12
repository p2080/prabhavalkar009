package constructor;

public class CS3 {
	int a; //variable declaration
	int b; //variable declaration

	public CS3()
	{
		//user defined constructor 
		// the constructor is called when an object of class is created 
		System.out.println("hi user defined constructor is running");
		//initialize data member/variable 
		a=900;
		b=800;
	}

	public static void main(String[] args) 
	{
		CS3 C3 = new CS3(); //object of class is created 
		C3.add();
		C3.subs();
	}
	
	void add()
	{
	int sum =a+b; // value of a & b will be  received from constructor
	System.out.println("addition is "+sum);
	}
	
	void subs()
	{
		int sub =a-b; // value of a & b will be received from constructor
		System.out.println("substration is "+sub); 
	}
}
