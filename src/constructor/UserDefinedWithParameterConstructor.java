package constructor;

public class UserDefinedWithParameterConstructor {
	
	int a;
	int b;
	int c;
	
	public UserDefinedWithParameterConstructor() //user defined constructor without parameter
	{
	a=10;
	b=20;
	c=30;
	
	}
	
	public UserDefinedWithParameterConstructor(int x)
	{
		a=x;
	}
	
	public UserDefinedWithParameterConstructor(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public UserDefinedWithParameterConstructor(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) 
	{
		 UserDefinedWithParameterConstructor AD1 = new  UserDefinedWithParameterConstructor(); // create object of user defined constructor without parameter
         AD1.addition(); //calling object of user define constructor without parameter 
         
         UserDefinedWithParameterConstructor AD2 = new UserDefinedWithParameterConstructor(150);// create object of user defined constructor with parameter 
         AD2.addition();// calling object of user defined constructor with parameter 
         
         UserDefinedWithParameterConstructor AD3 = new UserDefinedWithParameterConstructor(150, 200);//object of user defined constructor with parameter
         AD3.addition(); //calling object of user defined constructor with parameter 
         
         UserDefinedWithParameterConstructor AD4 = new UserDefinedWithParameterConstructor(150,200,250);//object of user defined constructor with parameter
         AD4.addition();//calling object of user defined constructor with parameter 
         
    }
	
	public void addition()
	
	{
	 int sum=a+b+c;
	 System.out.println("==========================");
	 System.out.println("addition is "+sum);
	 System.out.println("==========================");
	 }

}
