package TypesOfVariables;

public class Employee1 {
    String employee_name  = "prasanna";
    int id = 2025;
    float salary = 20000.50f;
    char grade ='A';
    
	
	
	public static void main(String[] args) {
		
      Employee1 ee = new Employee1();//  object of non static variable from same class
      System.out.println("=============================================");
      System.out.println(" employee name is---->>>> "+ee.employee_name);// calling object from same class
      System.out.println(" employee id no is--->>>> "+ee.id);
      System.out.println(" employee salary is--->>>> "+ee.salary);
      System.out.println(" employee grade is--->>>> "+ee.grade);// calling object from same class
      System.out.println("==============================================");
      
      Employee1.display();//calling object of static method from same class 
	}
    
	public static void display()
	{
		String employee_name = "pratik";
		int id = 2022;
		float salary = 25000.99f;
		char grade ='A';
		
		System.out.println("=================================");
		System.out.println("employee name is "+employee_name);
		System.out.println("employee id is "+id);
		System.out.println("employee salary is "+salary);
		System.out.println("employee grade is "+grade);
	    System.out.println("=================================");
	}   
}
