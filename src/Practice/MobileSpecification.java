package Practice;

public class MobileSpecification {
	// variable declaration
	String name;
	int Memory;
	float Disply;
	int Camera;
	char Grade;
	
public void MobileDetails(String name, int Memory, float Display, int Camera, char Grade) // static method with parameter
	
	{
		System.out.println("<<<<<<<<<<<========>>>>>>>>>>>");
		System.out.println("Mobile Information");
		System.out.println("<<<<<<<<<<<========>>>>>>>>>>>");
		System.out.println("Model of mobile is--->"+name);
		System.out.println("Internal memory of mobile is--->"+Memory);
		System.out.println("Display size of mobile is--->"+Display);
		System.out.println("Camera details of mobileis--->"+Camera);
		System.out.println("Ratings--->"+Grade);
		
	}
	
	

	public static void main(String[] args) {
		MobileSpecification ss = new MobileSpecification();// craete object of static method 
	    ss.MobileDetails("Vivo V21", 64, 8.5f, 12, 'A');  // calling object 
	    ss.MobileDetails("i phone 13", 128, 7f, 15, 'A');
	    ss.MobileDetails("one+ 8", 256, 6.5f, 12, 'B');
        ss.MobileDetails("Nokia 3310", 8, 4f, 8, 'A');		

	}

}
