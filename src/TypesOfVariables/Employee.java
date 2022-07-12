package TypesOfVariables;

public class Employee
{
	String name;
	String city;
	int emp_id;
	float salary;
	char grade;
	
	
	public Employee()
	{
		name = "prasanna";
		city = "kolhapur";
		emp_id = 1125;
		salary = 32000.99f;
		grade = 'A';
	}
	
	
	public Employee(String name1, String place, int empid, float sal, char gra )
	{
	 name= name1;
	 city= place;
	 emp_id= empid;
	 salary= sal;
	 grade= gra;
	  
	 	
	}
	
	public void display()
	{   System.out.println("===============================");
		System.out.println("the name of employee is "+name );
		System.out.println("the employee id of employee is "+emp_id);
		System.out.println("salary of employee is "+salary);
		System.out.println("grade of employee is "+grade);
		System.out.println("===============================");
	}
	
    
     public static void main(String[] args) {
		
	    Employee ed = new  Employee ();
		ed.display();
		Employee ed1 = new Employee("kapil", "kolhapur", 1415, 30000.99f, 'A');
	    ed1.display();

	}
}
