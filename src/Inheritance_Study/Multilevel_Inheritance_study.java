package Inheritance_Study;

public class Multilevel_Inheritance_study {

	public static void main(String[] args) 
	{
      Kolhapur k = new Kolhapur();
      k.Prime_Minister();//using super most property
      k.India_capital();// using super most property
      k.Chief_Minister();// using super class property
      k.Capital_Mumbai();// using super class property
      k.Parent_Minister();//using own property
      k.Capital_Rajaramouri();// using own property
	
	System.out.println("==========================================");
	
	  Maharastra M = new Maharastra();
	  M.Prime_Minister();//using super property
	  M.India_capital();// using super property
	  M.Chief_Minister();//using own property
	  M.Capital_Mumbai();// using own property
	
	System.out.println("==========================================");
	
	  India I = new India();
	  I.Prime_Minister();// using own property
	  I.India_capital(); // using own property
	  
	  System.out.println("========================================");
	}

}
