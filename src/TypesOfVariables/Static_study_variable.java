package TypesOfVariables;

public class Static_study_variable {
	
	
    static int a = 40; //static global variable 
    
    
    
    
	public static void main(String[] args) {

		Static_study_variable ssv = new Static_study_variable();
		ssv.display();
		System.out.println("value of a is "+a); //calling static global variable from same class
		System.out.println("value of p is "+Study_Static1.p);// calling static global variable from dif class
		
		
		
		
		
	}
	public void display()
	{
		int b =30;
		System.out.println("value of b is "+b);
		System.out.println("value of a is "+a);
	}

}
