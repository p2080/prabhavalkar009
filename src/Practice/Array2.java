package Practice;

public class Array2 {

	public static void main(String[] args) 
	{
      int a [] = {1,4,5,6};
      int b [] = {10,20,30,40};
      
      int sum = 0;
      int sum1 = 0;
//     int sum2 = 0;
//      
      for(int i=0;i<=a.length-1;i++) 
      {
    	   sum=sum+a[i];
  		  
      }
      for(int j=0;j<=a.length-1;j++)
      {
    	  sum1=sum1+b[j];
    	  
      }
      
      System.out.print(sum+sum1+" "); 
      }
	}


