package Inheritance_Study;

public class Multi_Level_Inheritance_Study2 {

	public static void main(String[] args) {
		
  
		son s = new son(); //object create of child class can call all properties
		s.Keys();// properties of super most class
		s.recipe(); // properties of super most class
		s.Home(); // properties of super class
		s.Money();// properties of super class
		s.Mobile(); // properties of own class
		s.Laptop(); // properties of own class
		
		System.out.println("======================");
		
		Mother m =new Mother();
		m.Keys();// properties of super class(grandmother)
		m.recipe(); // properties of super class(grandmother)
		m.Home(); //properties of own class
		m.Money(); //properties of own class
		
		System.out.println("=======================");
		
		Grandmother gm = new Grandmother();
		gm.Keys();// properties of own class
		gm.recipe();// properties of class
		
	}

}
