package thisAndSuperKeyword;

public class ThisUse {
	
	int a = 10;// not-static globale variable
    static int b = 99;
    
	public static void main(String[] args) 
	{
     ThisUse tu = new ThisUse(); //created object of a class
     tu.test();// calling local method 
	}
	
	public void test()
	{
		int a =100;//local variable
		System.out.println("local variable of a is "+a);
		System.out.println("globale variable of a is "+this.a);
		System.out.println("gloable variable of b is "+this.b);
		
		
		//i want use to local value
		int add1=1+a;//a is local value
		System.out.println("value of add1 is "+add1);
        
		
		//i want use to global value of a
		int add2=1+this.a;
		System.out.println("value of add2 is "+add2);
		//static int b=8;
		
	}

}
