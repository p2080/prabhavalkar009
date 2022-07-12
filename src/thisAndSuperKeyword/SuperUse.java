package thisAndSuperKeyword;

public class SuperUse extends thisAndSuperKeyword
{

	int p = 120;//global variable from super use  class
	
	public static void main(String[] args) 
	{
      SuperUse su = new SuperUse();
      su.test1();
	}

	public void test1()
	{
		int p = 1;//local variable
		
	//	p=p+10;
		
	//	p=p+this.p+100+super.p;
		
		System.out.println("local value of p is "+p); //local variable 
		System.out.println("global value of p from same class "+this.p);//global variable from same class 
		System.out.println("global value of p from super class "+super.p);//global variable from different class
	}
}
