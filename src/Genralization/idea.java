package Genralization;

public class idea implements TRAI
{

	@Override
	public void call() 
	{
		System.out.println("1.75rs/min");	
	}

	@Override
	public void msg() 
	{
		System.out.println("300msg/day");	
	}

	@Override
	public void data() 
	{
		System.out.println("2.00Gb/day");
	}
    
	public void new_method_idea()
	{
		System.out.println("new method idea");
	}
}
