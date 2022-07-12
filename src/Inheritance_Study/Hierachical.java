package Inheritance_Study;

public class Hierachical {

	public static void main(String[] args) {
     
		Daughter d = new Daughter()	;
		d.Home(); //sub class calling parent class properties
		d.Money(); //sub class calling parent class properties
		d.emotion(); // sub class calling there own class
		d.jewlery(); // sub class calling there own class
		
		System.out.println("======================");
		
		son s = new son();
		s.Home();//sub class calling parent class
		s.Money();// sub class calling parent class 
		s.Mobile();// sub class calling own class
		s.Laptop();// sub class calling own class
	}

}
