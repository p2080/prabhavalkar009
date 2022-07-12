package control_statment;

public class NestedIfElseStudy {

	public static void main(String[] args) 
	{
     // if UN is invalid -->enter PWD
	 // if PWD is valid --> login
	 // else PWD is valid --> incorrect PWD
	 //else UN is invalid --> incorrect pin
	
		String UN = "Velocity";
		String PWD = "Velocity@123";
		
		if (UN == "Velocity") // outer loop
			
		{  
			System.out.println("Enter passward");
		
	        if (PWD == "Velocity@123")
			{
				System.out.println("login Success");
			}
			else
			{
				System.out.println("incorrect pin");
			}
		}
		else 
		{
			System.out.println("incorrect UN");
		}
	}

}
