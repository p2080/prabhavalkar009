package control_statment;

public class NestedIfElseStudy2 {
	

    //if you clear pre-exam ----> selected for main exam
	//if you clear main-exam ---> selected for interview
	//if you clear interview ---> selected for govt job
	//else not clear interview--->not selected for job
	//else not clear main exam -->not selected for interview
	//else not clear pre exam --->you are fail
		
		String PRE="PRE_exam";
		String MAIN ="MAIN_exam";
		String INTE ="INTERVIEW";
		
		
		public void exam()
		{
		if(PRE=="PRE_exam")
		{
			   System.out.println("selected for main exam");
			   
			   if(MAIN=="MAIN_exam")
			   {
				   System.out.println("selected for interview");
				   
				 if(INTE=="INTERVIEw")
				 {
					 System.out.println("selected for govt job");
					 
				 }
				 else
				 {
					 System.out.println("not selected for job");
				 }
				 
			   }
				 
				 else 
				 {
					 System.out.println("not selected for interview");
				 }
			   
		       }
				 else
				 {
					System.out.println("you are fail"); 
				 }
               }
		

              public static void main(String[] args) 
		      {
    	            NestedIfElseStudy2 nif = new NestedIfElseStudy2();
		            nif.exam();
		   
	       	}
	}


