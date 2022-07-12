package AccessSpecifier3;

import Practice.accessSpecifier1;

public class AccesDisplay extends accessSpecifier1{

	public static void main(String[] args)
	{
		
     accessSpecifier1 as = new accessSpecifier1();
     as.display4();//calling public class from diff class
	
	System.out.println("==================");
     AccesDisplay ad = new AccesDisplay();
     ad.display3();//calling protected method from diff package 
     ad.display4();//calling public method from  diff class
     
     
	}
      
}
