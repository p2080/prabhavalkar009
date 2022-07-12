package AccessSpecifier;

public class Pune {

	public static void main(String[] args) 
	{
    Velocity v = new Velocity();
    //v.test1(); calling private class -->(visible only with class)
    v.test2();//calling default method -->(visible within package only)
    v.test3();// calling protected method-->(visible within package only-->inheritance will provide out of package) 
    v.test4();//calling oublic class -->(visible throghout project)
    
    System.out.println("=========================");
    
	}

}
