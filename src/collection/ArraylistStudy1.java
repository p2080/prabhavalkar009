package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

import Loop.For_Loop;

public class ArraylistStudy1 {

	public static void main(String[] args) 
	{
		ArrayList av = new ArrayList<>();
		
		av.add("velocity");
		av.add(null);
		av.add(200);
		av.add(15.15);
		av.add("velocity");
		av.add('A');
		av.add(null);
		av.add(20);
		av.add(true);
		
		System.out.println(av.get(0));
		System.out.println(av);
		System.out.println(av.size());
		System.out.println(av.isEmpty());
        System.out.println(av.indexOf(15.15));
        System.out.println(av.lastIndexOf(20));
        System.out.println(av.contains(2));
        System.out.println(av.contains(null));
        
        
        System.out.println("=============");
        for(int i=0;i<=av.size()-1;i++) //for loop method
		{
			System.out.println(av.get(i));
		}
        
        System.out.println("=============");
        Iterator av1 = av.iterator();
        while(av1.hasNext())
        {
        	System.out.println(av1.next());
        }
       
        System.out.println("=============");
        ListIterator av2 = av.listIterator();
        while(av2.hasNext())
        {
        	System.out.println(av2.next());
        }
        
        System.out.println("=============");
        for(Object av5:av)
        {
        	System.out.println(av5);
        }
	}

}
