package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashList_set_interger {

	public static void main(String[] args) 
	{
		HashSet<Integer> hi = new HashSet<Integer>();
		
		hi.add(20);
		hi.add(25);
		hi.add(45);
		hi.add(50);
		hi.add(45);
		hi.add(75);
		
		System.out.println(hi.size());
		System.out.println(hi);
		System.out.println(hi.contains(45));
		System.out.println(hi.isEmpty());
		System.out.println("===========");
		
		
		
		//universal iterator method
		Iterator<Integer> hi1 = hi.iterator();
		while(hi1.hasNext())
		{
			System.out.println(hi1.next());
		}
		System.out.println("===========");
		
		
		//for loop
		for(int i=0;i<=hi.size()-1;i++)
		{
			System.out.println(hi);
		}
		System.out.println("===========");
		
		
		//for each method
		for(Integer hi2:hi)
		{
			System.out.println(hi2);
		}
		

	}

}
