package Genralization;

public class hdfc implements CreditCard
{

	@Override
	public void type_of_card()
	{
     System.out.println("types of card is dimond");		
	}

	@Override
	public void credit_limit()
	{
		System.out.println("credit limit of card is 125000/-");
	}

	@Override
	public void annual_fee() 
	{
	    System.out.println("annual fee of card is 699/-");	
	}

	@Override
	public void statment_genrate_date() 
	{
		System.out.println("stament genrate date of per month day of  05");
	}
	
	public void types()
	{
		System.out.println("total types of hdfc card is 6");
	}

}
