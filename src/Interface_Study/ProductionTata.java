package Interface_Study;

public class ProductionTata implements TataLWV{

	public static void main(String[] args)
	//this class implements sub interface tataLWV
	//as TataLWV is sub interface,that its own property and property from tata 
	//production tata has to give defination to all incomplete method
	
	
	{
      ProductionTata pt = new ProductionTata();
      pt.Truck();
      pt.Bus();
      pt.car();
      pt.minibus();
	}

	@Override
	public void Truck() 
	{
	 System.out.println("this is super interface Truck");	
	}

	@Override
	public void Bus() 
	{
		System.out.println("this is super interface Bus");
	}

	@Override
	public void car() 
	{
		System.out.println("this is sub interface car ");
	}

	@Override
	public void minibus() 
	{
        System.out.println("this is sub interface minibus");		
	}

}
