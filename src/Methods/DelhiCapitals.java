package Methods;

public class DelhiCapitals {

	public static void main(String[] args) {
		DelhiCapitals DD = new DelhiCapitals(); // created object from same class 
		DD.Teaminfo(); // calling object from class without parameter
		DD.Team("Warner", "12", 200, 5000, 50.55,'a');//calling method with parameter
		DD.Team("Prithvi shaw", "5" , 105, 3550, 40.66, 'B' );// calling method with parameter
		DD.Team("Shardual thakur", "28", 150, 2500, 40.50, 'A');// calling method with parameter
		

	}
	
	public void Teaminfo()// non static method without parameter
	
	{
		//Name, JearsyNO, Matches,TotalRuns, Average, Grade
		
		String Name = "Rishabh pant";
		String JearsyNo = "17";
		int Matches = 205;
        int TotalRuns = 4500;
        Float Average = 45.35f;
        char Grade = 'A';
        
        System.out.println("==============================");		
        System.out.println("Player Name is "+Name);
        System.out.println("Player JearsyNo is "+JearsyNo);
        System.out.println("Total Runs is "+TotalRuns);
        System.out.println("Career Average is "+Average);
        System.out.println("Career Grade is "+Grade);
        System.out.println("Total Matches is "+Matches);
        System.out.println("===============================");
     }
	
	public void Team(String Name,String JearsyNo,int Matches,int TotalRuns,double d,char c  )// with parameter
	
	{
		    System.out.println("==============================");
		    System.out.println("Player Name is "+Name);
	        System.out.println("Player JearsyNo is "+JearsyNo);
	        System.out.println("Total Matches is "+Matches);
	        System.out.println("Total Runs is "+TotalRuns);
	        System.out.println("Career Average is "+d);
	        System.out.println("Career Grade is "+c);
	        System.out.println("================================");
	}    
	
	
	
	
	
	
	
	
	
	
	
	
	

}
