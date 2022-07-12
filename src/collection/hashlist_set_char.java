package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashlist_set_char {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("prasanna");
		hs.add("20");
		hs.add("prasanna");
		hs.add("velocity");
		hs.add("prabhvalkar");
		hs.add("rajrampuri");
		hs.add(null);
		
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("prasanna"));
		System.out.println(hs.contains("hlo"));
		System.out.println("==============");
		
		
		
		//universal iterator method
		Iterator<String> hs1 = hs.iterator();
		while(hs1.hasNext())
		{
			System.out.println(hs1.next());
		}
		System.out.println("==============");
		
		
		//for each method
		for(String hs2:hs)
		{
			System.out.println(hs2);
		}
		System.out.println("==============");
		
		
		
		//for loop
		for(int i=0;i<=hs.size()-1;i++)
		{
			System.out.println(hs);
		}
        
		
		
		
	}

}
