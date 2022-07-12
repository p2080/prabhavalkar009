package control_statment;

public class else_if_2 {

	public static void main(String[] args) 
	{
     int marks = 50;
     if(marks>=60 & marks<100)
     {
    	 System.out.println("you are in dist");
     }
     else if (marks>=50 & marks<60)
     {
    	 System.out.println("you are in first class");
     }
     else if (marks>=40 & marks<50)
     {
    	 System.out.println("you are pass");
     }
     else if (marks>100)
     {
    	 System.out.println("invalid marks range ,please enter valid value between 0-100");
     }
     else
     {
    	 System.out.println("you are fail");
     }
	}

}
