package control_statment;

public class Switch_Study_3 {

	public static void main(String[] args) 
	{
     int amount=100000;
     
    {
    	 {
    	 switch (amount) {
		
    	 case 100000:
			System.out.println("you are our platinum customer");
			break;
			
    	 case 50000:
    		 System.out.println("you are our gold customer");
    		 break;
    		 
		default:
			System.out.println("you not our cutomer so fill up account opening form ");
			break;
		}
     } 
     
     
	}
	}
}
