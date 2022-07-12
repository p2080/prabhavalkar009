package TypesOfVariables;

public class GlobaleAndLocalVariable {
	int a=100; //global variable  
	static int b=100; // global static variable 

	public static void main(String[] args) 
	{
		 //int a =10;
		 GlobaleAndLocalVariable galv =new  GlobaleAndLocalVariable(); //create object of class
		 System.out.println("value of a is "+galv.a);//calling non static global variable from same class
		 
		 
		 System.out.println("value of b is "+b);// calling static global variable  from same class 
		 System.out.println("value of staic global variable from differt class "+test.y);//calling static variable from diff class
		 
		 test t =new test(); // create object from diff class
		 System.out.println("value of non staic globale variable from another class is "+t.x);//calling non static global variable from another class
		
		 
		 galv.addition(); // calling local variable addition method in same class
		 galv.sub(); // calling local variable sub method in same clASS
         		 
		 
		int mul = b*galv.a;
		System.out.println("mul is "+mul);
		
		int div = b/(test.y);
		System.out.println("Div is "+div);
		
		int addition = galv.a+t.x;
		System.out.println("Add is "+addition);
		 
		 
	}
	
	public void addition()
	{
	int p = 10; 
	int sum = p+10; //p is local variable know to addition method only
	int sum1 = a+100; // a is global variable to know whole class
	
	System.out.println("========================");
	System.out.println("Value of p is "+p);
	System.out.println("value of sum is "+sum);
	System.out.println("value of sum1 is "+sum1);
	System.out.println("========================");
	
	}
	
	public void sub()
	{
		int q = 20; // q is local variable to know sub method only
		//int sub = p-q; //p is local variable to know only addition(another) method only 
		int subs = a-q; // a is global variable to know whole class
			
	    System.out.println("value of q is "+q);
		System.out.println("value of sub is "+subs);
		System.out.println("========================");		
	}

	

}
