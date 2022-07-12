package Practice;

public class SSmobile {

	public static void main(String[] args)
	{
     accessSpecifier1 as = new accessSpecifier1();
     //as.display1();//private method is not allowed diff class
     as.display2();//calling default method from diff class
     as.display3();//calling protected method from diff class
     as.display4();//calling public method from diff class
	}

}
