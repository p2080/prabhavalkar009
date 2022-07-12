package Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args)
	{
     MethodOverLoading ml = new MethodOverLoading();
     ml.test();
     ml.test1(10, 100);
	}
    
	public void test()
	{
		int a =10;
		int b =20;
		int Add =a+b;
		System.out.println("addition of Add is="+Add);
	}
	
	public void test1(int a,int b)
	{
	 int Add1=a+b;
	 System.out.println("addition of Add1 is="+Add1);
	}
	
	
	
}
