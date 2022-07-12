package Abstract_class;

public class Ccc extends Display {

	public static void main(String[] args)
	{
     Ccc c = new Ccc(); //create object
	
     c.add1();//calling diff class method
     c.add();//calling diff class incomplete method
     c.demo();//calling own method
	}
	
	public void add()
	{
		int i = 20; 
		int j = 30;
		int X = i+j;
		System.out.println("value of X is ="+X);
	}

	public void demo()
	{
		int f = 40;
		int g = 50;
		int H =f+g;
		System.out.println("value of H is ="+H);
	}
}
