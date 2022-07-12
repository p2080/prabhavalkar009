package Array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args)
	{
      int rollnum[] = {6,1,4,2,3,5};
      
      for(int i=0; i<=rollnum.length-1;i++)
      {
    	  System.out.println(rollnum[i]);
      }
      System.out.println("================");
      
      //how to sort given array
      //we need to use sort method
      
      Arrays.sort(rollnum);
      for(int i=0; i<=rollnum.length-1;i++)
      {
    	  System.out.println(rollnum[i]);
      }
      System.out.println("================");
      
      for(int i=rollnum.length-1; i>=0; i--)
      {
    	  System.out.println(rollnum[i]);
      }
     
      
	}

}
