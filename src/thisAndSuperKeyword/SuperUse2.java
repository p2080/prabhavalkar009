package thisAndSuperKeyword;

public class SuperUse2 extends this_super {
	
	int i = 200;
	
	public static void main(String[] args) 
	{
	SuperUse2 su = new SuperUse2();//create object of same class
	su.display1();//calling method from same class
	
	}
	
  public void display1()
  {
	  int p = 20;
	  int q = 30;
	  int o = 40;
	  
	  int p1=p+q;
	  int q1=q+o;
	  int i1=p1+q1+this.i;
	  int z1=p1+super.m;
	  int z2=q1+super.n;
	  
	  System.out.println("====================");
	  System.out.println("value of p1 is "+p1);
	  System.out.println("value of q1 is "+q1);
	  System.out.println("value of i1 is "+i1);
	  System.out.println("value of z1 is "+z1);
	  System.out.println("value of z2 is "+z2);
	  System.out.println("====================");
  }
}
