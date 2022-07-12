package Genralization;

public class Airtel implements TRAI 
{

	@Override
	public void call() 
	{
		System.out.println("0.5rs/min");
	}

	@Override
	public void msg()
	{
		System.out.println("150msg/day");
	}

	@Override
	public void data() 
	{
		System.out.println("1.5Gb/day");
	}
    
	public void new_method_airtel()
	{
		System.out.println("new method Airtel");
	}
}
