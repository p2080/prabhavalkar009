package Inheritance_Study;

public class Hierachical_Study {

	public static void main(String[] args) 
	{
      Sangali s = new Sangali();
      s.Chief_Minister();// using super class property
      s.Capital_Mumbai();// using super class property
      s.Sangali_minister();// using own property
      s.Capital_sangali();// using own property
	
      System.out.println("=======================================================");
	
	  Kolhapur k = new Kolhapur();
	  k.Chief_Minister();// using super class property
	  k.Capital_Mumbai();// using super class property
	  k.Parent_Minister();// using own property
	  k.Capital_Rajaramouri();// using own property
	  
   	  System.out.println("==========================================================");
	
	}

}
