package Genralization;

public class Jio implements TRAI
{

	@Override
	public void call() 
	{
		
		System.out.println("1.00rs/min");
	}

	@Override
	public void msg()
	{
		System.out.println("100msg/day");
		
	}

	@Override
	public void data() 
	{
		System.out.println("2Gb/day");
		
	}
    
	public void new_method_jio()
	{
		System.out.println("jio new method");
	}
}
