package Inheritance_Study;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
     Mother ms = new Mother();
     ms.recipe();
     ms.Keys();
     ms.Home();
     ms.Money();
    
     
     System.out.println("===============");
     
     son sm = new son(); //creating object of child class
     sm.Home(); // using super class 
     sm.Money(); // using super class property
	 sm.Mobile(); // using own property
	 sm.Laptop(); // using own property
	}

}
