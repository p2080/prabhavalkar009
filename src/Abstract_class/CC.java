package Abstract_class;

public class CC extends Sample{

	public static void main(String[] args) 
	{
     CC c = new CC();//created object of concrete class
     c.test();//method from sample
     c.test1();//method from CC
     c.demo();//own method from CC
	}
	public void test1()
	{
		System.out.println("this method is completed in concrete class");
	}
    public void demo()
    {
    	System.out.println("method from cc ");
    }
}

