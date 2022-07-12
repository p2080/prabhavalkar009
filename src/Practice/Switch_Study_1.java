package Practice;

public class Switch_Study_1 {

	public static void main(String[] args) {
		
       String Name="safari";
       {
    	   switch (Name) {
    	   
		case "Creata":
		  System.out.println("company name Hyndai SUV car");        
		break;
		
		case "verna":
          System.out.println("company name Hyndai car");
         break;
         
		case "fortuner":
			System.out.println("company name is Toyota SUV car");
	    break;
		
		case "safari":
			System.out.println("comapny name is Tata");
		break;
		
		case "innova":
			System.out.println("company name is Toyota");
	    break;
	    
		case "swift":
			System.out.println("company name is Maruti Suzuki ");
			
		default:
			System.out.println("please enter valid input");
			break;
		}
       }
	}

}
