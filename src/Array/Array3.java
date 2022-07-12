package Array;

public class Array3 {

	public static void main(String[] args) 
	{
      String name [] = new String[6];
      name[0] = "ram";
      name[1] = "laxman";
      name[2] = "seeta";
      
//      for(int i=0; i<=name.length-1; i++)
//      {
//    	  System.out.println(name[i]);
//      }
//      
      for(int i=name.length-1;i>=0;i--)
      {
    	  System.out.println(name[i]);
      }
		
	}

}
