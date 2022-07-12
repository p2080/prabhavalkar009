package Methods;

public class PuneUniversity {

	public static void main(String[] args) {
		
		PuneUniversity PU =new PuneUniversity(); //created object of class
		PU.studentinfo();// calling method without parameter
		PU.studentinfo("Mahesh", "PU454545", "Engg", 3 , 'A'); //calling method with parameter
		PU.studentinfo("Kapil", "PU505050", "BSC" , 2 , 'A');  //calling method with parameter
		PU.studentinfo("Akshay", "PU515151", "Bcom", 2 , 'B'); //calling method with parameter
	}

     public void studentinfo() //non-static method without parameter
     
        { //Name,PRN,Course,Year,Grade
        String Name ="Velocity";
        String PRN ="PU313131";
        String Course ="Engg";
        int Year = 2;
        char Grade = 'a'; 
      
        System.out.println("===========================");
        System.out.println("student Name is "+Name );
        System.out.println("student PRN number is "+PRN);
        System.out.println("student Course is "+Course);
        System.out.println("student Year is "+Year);
        System.out.println("student Grade is "+Grade);
        System.out.println("============================");
     }
     
     public void studentinfo(String Name,String PRN,String Course,int Year, char Grade)//method with parameter
     {
    	 System.out.println("===========================");
         System.out.println("student Name is "+Name );
         System.out.println("student PRN number is "+PRN);
         System.out.println("student Course is "+Course);
         System.out.println("student Year is "+Year);
         System.out.println("student Grade is "+Grade);
         System.out.println("============================");
     }
     
}
