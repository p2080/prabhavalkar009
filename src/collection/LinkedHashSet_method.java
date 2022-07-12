package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_method {

	public static void main(String[] args) 
	{
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("pune");
		lhs.add("pune");
		lhs.add(200);
		lhs.add(null);
		lhs.add('A');
		lhs.add(null);
		lhs.add(12.12);
		lhs.add(true);
		
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println(lhs.contains('A'));
		System.out.println(lhs.isEmpty());
		
		System.out.println("===========");
		//for each method
		for(Object lhs2:lhs)
		{
			System.out.println(lhs2);
		}
		
		
		System.out.println("===========");
		//for loop method
		for(int i=0;i<=lhs.size()-1;i++);
		{
			System.out.println(lhs);
		}
		
		System.out.println("===========");
		//iterator method
		Iterator lhs1 = lhs.iterator();
		while(lhs1.hasNext())
		{
			System.out.println(lhs1.next());
		}
		
		
		
	}

}
