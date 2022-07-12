package thisAndSuperKeyword;

public class ThisUse2 {
	int z=100;
	int y=50;
	int x=25;
	
	public static void main(String[] args) {
		ThisUse2 su = new ThisUse2();
	      su.sample();
		}
	
	    public void sample()
	    {
	    	int a =10;
	    	int b =20;
	    	int c =30;
	    	int a1=a+b+c;
	    	int b1=a1+a+b+c;
	    	int c1=b1+a+b+c;
	    	int a2=a1+this.x;
	    	int b2=b1+this.y;
	    	int c2=c1+this.z;
	    	
	    	System.out.println("====================");
	    	System.out.println("value of a1 is "+a1);
	    	System.out.println("valie of b1 is "+b1);
	    	System.out.println("value of c1 is "+c1);
	    	System.out.println("value of a2 is "+a2);
	    	System.out.println("value of b2 is "+b2);
	    	System.out.println("value of c2 is "+c2);
	    	System.out.println("====================");

	}

}
