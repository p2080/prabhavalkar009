package Genralization;

public class axis implements CreditCard
{

	@Override
	public void type_of_card()
	{
	   System.out.println("type of card is gold");	
	}

	@Override
	public void credit_limit() 
	{
		System.out.println("card limt is 50000/-");
	}

	@Override
	public void annual_fee()
	{
	   System.out.println("annual fee of card is 349/-");	
	}

	@Override
	public void statment_genrate_date()
	{
		System.out.println("statment genrate date is per month day of 10");
	}

}
