package Interface_Study;

public class govofindia implements sbi,hdfc,axis,boi{

		public static void main(String[] args) 
		{
	       govofindia r = new govofindia();
	        r.saving_hdfc();
	        r.current_hdfc();
	        r.intrest_rate_hdfc();
	        
	        
	        System.out.println("====================================================");
	        r.saving_axis();
	        r.current_axis();
	        r.intrest_rate_axis();
	        
	        System.out.println("====================================================");
	        r.saving_boi();
	        r.current_boi();
	        r.intrest_rate_boi();
	        
	        System.out.println("====================================================");
	        r.saving_sbi();       
	        r.current_sbi();
	        r.intrest_rate_sbi();
	        
	        System.out.println("====================================================");
	        r.saving();
	        r.current();
	        r.intrest_rate();
	 
		}

		@Override
		public void saving_hdfc()
	    {
			System.out.println("min saving account balnce req in hdfc bank is 5000");
		}

		@Override
		public void current_hdfc() 
		{
			System.out.println("min current acc balance req in hdfc bank is 10000");
		}

		@Override
		public void intrest_rate_hdfc()
		{
			System.out.println("home loan intrest rate in hdfc bank is 7.50%");
		}

		@Override
		public void saving_axis() 
		{
			System.out.println("min saving account balnce req in axis bank is 70000");
		}

		@Override
		public void current_axis() 
		{
	   		System.out.println("min current account balance req in axis bank is 15000");
		}

		@Override
		public void intrest_rate_axis() 
		{
			System.out.println("home loan intrest rate in axis bank is 8.00%");
		}

		

		@Override
		public void saving_boi() 
		{
			System.out.println("min saving account balnce req in boi bank is 8000");
		}

		@Override
		public void current_boi() 
		{
			System.out.println("min current account balance is req in boi bank is 14000");
		}

		@Override
		public void intrest_rate_boi() 
		{
			System.out.println("home loan intrest rate in boi bank is 7.25%");
		}

		@Override
		public void saving_sbi() 
		{
		    System.out.println("min saving account balance is req in sbi bank is 8500 ");	
		}

		@Override
		public void current_sbi() 
		{
			System.out.println("min current account balance is req in sbi bank is 20000");
		}

		@Override
		public void intrest_rate_sbi() 
		{
			System.out.println("home loan intrest rate in sbi is 7.65%");
		}
		
		
		
		
		
		public void saving() //doubt
		{
			System.out.println("min saving account balance in Rbl bank is 10000");
		}

		public void current()  //doubt
		{
			System.out.println("min current account balance in Rbl bank is 12500");
		}

		public void intrest_rate() //doubt
		{
			System.out.println("home loan intrest rate in Rbl bank is 6.5%");
		}

	}



