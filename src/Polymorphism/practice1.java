package Polymorphism;//over loading method

public class practice1 {
    
	int a=25;
	final int f=45;//use final keyword
	public static void main(String[] args) 
	{
     practice1 p = new practice1();
     p.add1();
     p.add1(20, 10, 5);
	}
     public void add1()
     {
         int b=30;
         int sum1=a+b;
         int sum2=a+b+f;//a is global & b is local 
         System.out.println("addition of sum1 is="+sum1);
         System.out.println("addition of sum2 is="+sum2);
     }
	public void add1(int i,int y,int d)
	{
		int sum3=i+y+d;
		int sub=i-y;
		System.out.println("============================");
		System.out.println("addition of sum3 is="+sum3);
	    System.out.println("substraction of sub is="+sub);
	}
	
}
