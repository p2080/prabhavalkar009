package casting;

public class UpcastingTest {

	public static void main(String[] args) 
	{
	  
	  
      son s = new son();//creating object of class son
      s.car();//calling method from diff class
      s.bike();//calling method from diff class
      s.degree();//calling method from diff class
      
      System.out.println("=============");
      father f = new father();//creating object of subclass and giving superclass reference 
      f.bike();//eligible for casting  
      f.car();//eligible for casting
      // f.degree();//not eligible for casting as its not common /superclass method
      
      System.out.println("=============");
      father f1 = new son();
      f1.bike();
      f1.car();
      
	}

}
