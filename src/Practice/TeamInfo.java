package Practice;

public class TeamInfo {

	public static void main(String[] args) {
		TeamInfo T1 = new TeamInfo(); // created object of non static method 
		T1.Teaminfo("England", "Chelsa", 5.8, 32, 'A');
		T1.Teaminfo("India", "RCB", 3.2, 24, 'A');
	    T1.Teaminfo("Spain", "Real Madrid", 7.5, 31, 'A');
	    T1.Teaminfo("Italy", "Juventus", 2.8, 30, 'B');
      		

	}
      //country,club name,value of club,players no ,grade wise ranking 
	public void Teaminfo(String Country,String Club, double Value,int Players,char Grade)// non static void method with parameter
	{
		System.out.println("===============================================");
		System.out.println("country name is----> "+Country);
		System.out.println("club name is----> "+Club);
		System.out.println("value of club is----> "+Value+ " Billon Doller");
		System.out.println("Players in this club is----> "+Players+" NO");
		System.out.println("Grade wise ranking of this club is----> "+Grade);
		System.out.println("===============================================");
		
	}
}
