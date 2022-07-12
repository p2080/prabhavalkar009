package control_statment;

public class Else_if_study {

	public static void main(String[] args)
	{
     //if marks is 60 then print dist
	 //if marks is 50 then print class
	 //if marks is 40 then print pass
	 //if marks is less than 40 then print fail
		
		int marks = 65;
		
		if(marks>=60 )
	    {
		System.out.println("you are in dist");
			
		}
		else if (marks>=50)
		{
		System.out.println("you are in 1st class");	
		}
		else if (marks>=40)
		{
		System.out.println("you are pass");	
		}
	    else if (marks<40) 
	    {
		System.out.println("you are fail");	
		}
//	    else if (marks>100)
//	    {
//	    	System.out.println("enter valid marks");
//	    }
	}

}
