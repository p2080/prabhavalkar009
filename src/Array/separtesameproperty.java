package Array;


public class separtesameproperty {

	public static void main(String[] args)
	{
	   int a[] = {1,2,3,4}; 
	   int b[] = {1,3,4,5};
		
	  for(int i=0;i<=a.length-1;i++)
	  {
		  for(int j=0;j<=a.length-1;j++)
		  {
			  if (a[i]==b[j])
			  {
				  System.out.print(a[i]+" ");
			  }
		  }
	  }
		
	}

}
