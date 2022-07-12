package control_statment;

public class Switch_Study_2 {

	public static void main(String[] args)
	{
      char grade = 'D';
     switch (grade) 
     {
	case 'A':
         System.out.println("you are platinum customer");				
	     break;
	
	case 'B':
		System.out.println("you are gold customer");
		break;
     
	case 'C':
		System.out.println("you are silver customer");
		break;
		
	default:
		System.out.println("please valid input A-C");
	    break;
	}
  }

}
