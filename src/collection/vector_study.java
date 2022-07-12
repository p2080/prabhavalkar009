package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_study {

	public static void main(String[] args) 
	{
      Vector v = new Vector<>();
      
      v.add(2500);
      v.add("velocit");
      v.add(null);
      v.add('A');
      v.add("velocity");
      v.add(250);
      
      System.out.println(v.get(0));
      System.out.println(v);
      System.out.println(v.size());
      
      System.out.println("==========");
      for(int i=0;i<=v.size()-1;i++)
      {
    	  System.out.println(v.get(i));
      }
      System.out.println("==========");	
      
      for(Object v1:v) //for each method
      {
    	  System.out.println(v1);
      }
      System.out.println("==========");	
    	
     Iterator v2 = v.iterator(); //iterator method
     while(v2.hasNext())
     {
    	 System.out.println(v2.next());
     }		
     System.out.println("==========");
     
     ListIterator v3 = v.listIterator(); //list-iterator method
     while(v3.hasNext())
     {
    	 System.out.println(v3.next());
     }
     System.out.println("==========");
     
     
     Enumeration ve = v.elements();//enumeration method
     while(ve.hasMoreElements())
     {
    	 System.out.println(ve.nextElement());
     }
     
	}

}
