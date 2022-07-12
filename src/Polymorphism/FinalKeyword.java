package Polymorphism;

public class FinalKeyword {

	int a=20;
	final int b =25;
	
	public static void main(String[] args) 
	{
     FinalKeyword fk = new FinalKeyword();
     fk.test1();
     fk.display();
	}
	
	public  final void display()
	{
		int d;
		d=a+b;
		System.out.println(d);
	}
   public void test1()
   {   int c;
	   a=a+10;
	   System.out.println(a);
	   c= b + 20;
	   System.out.println(c);
	 //  b = b + 20;
	 //  System.out.println(b);
     // we can't update value of final variable(value of b is can't change due to use of final keyword)   
   }
}
