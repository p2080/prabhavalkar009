package Practice;

public class accessSpecifier1 {

	public static void main(String[] args) 
	{
     accessSpecifier1 as = new accessSpecifier1();
     as.display1();//calling private method
     as.display2();//calling default method
	 as.display3();//calling protected method
	 as.display4();//calling public method
	
	}
   
	private void display1()
	{
		System.out.println("diapaly1 is samsung");
	}
	
    void display2()
    {
    	System.out.println("display2 is vivo");
    }
    
    protected void display3()
    {
    	System.out.println("display3 is apple");
    }
    
    public void display4()
    {
    	System.out.println("display4 is one+");
    }
}
