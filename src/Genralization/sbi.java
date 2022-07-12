package Genralization;

public class sbi implements CreditCard
{

	@Override
	public void type_of_card() 
	{
		System.out.println("card type is platinum");
	}

	@Override
	public void credit_limit() 
	{
		System.out.println("limit of card is 80000/-");
	}

	@Override
	public void annual_fee()
	{
       System.out.println("annual fee of card is 499/-");
	}

	@Override
	public void statment_genrate_date()
	{
		System.out.println("statment genrate date is per month date of 15");
	}
    
	public void types()
	{
		System.out.println("types of sbi card is 5");
	}
}
