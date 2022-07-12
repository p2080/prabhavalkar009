package TypesOfVariables;

public class Velocity_info {
    
	//name,id,dept,sal,grade
	
	String emp_name;
	int emp_id;
	String emp_dept;
	float emp_sal;
	char emp_grade;
	
	public void emp_info()
	{
		System.out.println("===================================");
		System.out.println("Employee name is  "+emp_name);
		System.out.println("Employee id no is "+emp_id);
		System.out.println("Employee department is "+emp_dept);
		System.out.println("Employee salary is "+emp_sal);
		System.out.println("Employee grade is "+emp_grade);
		System.out.println("===================================");
	}
	
	
	
	public static void main(String[] args) {
		Velocity_info MS_Dhoni = new Velocity_info();
		MS_Dhoni.emp_name ="MS Dhoni";
		MS_Dhoni.emp_id = 1415;
		MS_Dhoni.emp_dept = "Captain,Batsman,WC";
		MS_Dhoni.emp_sal = 50000.99f;
		MS_Dhoni.emp_grade = 'A';
		MS_Dhoni.emp_info();
		
		Velocity_info Virat_K = new Velocity_info();
		Virat_K.emp_name = "Virat Kohali";
		Virat_K.emp_id = 1818;
		Virat_K.emp_dept = "Batsman";
		Virat_K.emp_sal = 75000.99f;
		Virat_K.emp_grade = 'A';
		Virat_K.emp_info();
				
		
		
	}

}
