package Methods;

public class MathOperation
{
    public static void main(String[] args)
	{
		MathOperation m1 = new MathOperation(); // create object  same class
		m1.addition();// calling non-static method same class
	    sub();//calling static method same class
	    Test1 T2 = new Test1();// object create in diff class
	    T2.mul(); //calling non-static method in diff class
	    T2.div();//calling static method in diff class
    }
	public void addition() //non-static method 
	{
		int a=50;
		int b=10;
		int sum=a+b;
		System.out.println("adition of sum "+sum);
    }
	public static void sub() //static regular method 
	{
		int a=40;
		int b=20;
		int subs=a-b;
		System.out.println("substration of sub is "+subs);
	}

}
