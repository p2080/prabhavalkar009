package AccessSpecifier2;


import AccessSpecifier.Velocity; 

public class AccessTest extends Velocity {

	public static void main(String[] args) 
	{
     Velocity v = new Velocity();
     
     System.out.println("=====================");
    // v.test1();//calling private method--(visible only within class)
    // v.test2();// calling default method--(visible only within package)
    // v.test3();// calling protected method--(visible only within package)>>>Inheritance provide out of package
     v.test4();// calling public method--(visible througout project)
	
     System.out.println("=====================");
     
     
     
     //object should be created of subclass
     AccessTest a = new AccessTest();
     // v.test1();//calling private method--(visible only within class)
     // v.test2();// calling default method--(visible only within package)
    a.test3();// calling protected method-->(visible only within class---> inheritance provided out of pacakge
	a.test4();//calling public class-->(visible only within class)
	System.out.println("======================");
	}
    
}
