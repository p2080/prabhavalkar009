package Array;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) 
	{
      float value[] = new float[5];
      
      float value1 [] = {10.10f,11.11f,12.12f,10.12f,15.15f};
      
      String name[] = {"a,b,z,c,v,n"}; //doubt
      
      
      value[0] = 10.10f;
      value[1] = 20.20f;
      value[2] = 30.30f;
      value[3] = 40.40f;
      value[4] = 50.50f;
      
     // usage
      
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
		System.out.println(value[4]);
		
		System.out.println("==========");
		
		for(int i=0;i<=value.length-1; i++)
		{
			System.out.println(value[i]);
		}
		System.out.println("==========");
		
		for(int i=value.length-1; i>=0;i--)
		{
			System.out.println(value[i]);
		}
		
		System.out.println("==========");
		
		for(int i=0;i<=value1.length-1;i++)
		{
			System.out.println(value1[i]);
		}
		
		System.out.println("==========");
		
		Arrays.sort(value1);
		
		for(int i=0;i<=value1.length-1;i++)
		{
			System.out.println(value1[i]);
		}
		
		System.out.println("==========");
		for(int i=value1.length-1;i>=0;i--)
		{
			System.out.println(value1[i]);
		}
		
		
		System.out.println("==========");
	   
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		
	}

}
