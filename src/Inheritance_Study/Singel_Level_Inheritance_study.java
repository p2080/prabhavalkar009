package Inheritance_Study;

public class Singel_Level_Inheritance_study {

	public static void main(String[] args) 
	{
      Maharastra m = new Maharastra();
      m.Prime_Minister();//using super class property
      m.India_capital();// using super class property
      m.Chief_Minister();//using own property
      m.Capital_Mumbai();//using own property		
		
      System.out.println("================================");
      
	  India i = new India();
	  i.Prime_Minister();	//using own property		                       
	  i.India_capital();// using own property
	}

}
