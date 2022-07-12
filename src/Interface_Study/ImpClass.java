package Interface_Study;

public class ImpClass implements My_Interface {

	public static void main(String[] args) 
	{
    System.out.println(a);//calling variable of interface 
    
    ImpClass i = new ImpClass();//creating object of implementation class 
    i.m1();
    i.m2();
    i.m3();//own method of implementation class 
	}
	
	public void m1()//providing definition to incomplete method from interface
	{
	 System.out.println("method m1 is completed in in impletmentation class");	
	}
	
	public void m2()//providing definition to incomplete method from interface
	{
		System.out.println("method m2 completed in impelementation calss");
	}
	
	public void m3()//own method of Impclass
	{
		System.out.println("method m3 completed in implementation class");
	}
}
