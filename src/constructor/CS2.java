package constructor;

public class CS2 {
	
	int num1;
	int num2;
	int num3;
	
	
	public CS2() //user defined without parameter
	{
		num1=10;
		num2=20;
		num3=30;
		
	} 
     public CS2(int a) //user defined with parameter
     {
    	 num1=a;
     }
      
     public CS2(int a,int b) //user defined with parameter
     {
    	 num1=a;
    	 num2=b;
     }
     
     public CS2(int a,int b, int c) // user defined parameter
     {
    	 num1=a;
    	 num2=b;
    	 num3=c;
     }
     
   	public static void main(String[] args) 
	{
      CS2 C1 = new CS2(); // object created with default value zero
      C1.addition();
      
      CS2 C2 = new CS2(100);// object created with some default value
      C2.addition();
      
      CS2 C3 = new CS2(80,90);// object created with some default value
      C3.addition();
      
      CS2 C4 = new CS2(80,90,100);// object created with some default value
      C4.addition();
	}
    
	public void addition() //non static method
    
	{   
    	int sum = num1 + num2 + num3;
    	System.out.println("Addition is "+sum);	
    }
}
