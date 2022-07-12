package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashlist_set {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();//generic type
        
		hs.add("pune");
		hs.add(20);
		hs.add(null);
		hs.add(true);
		hs.add('A');
		hs.add("pune");
		hs.add(15.15);
		hs.add(null);
		hs.add(20);
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.contains(15.15));
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains('B'));
		
		//for loop
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println(hs.get);
//		}
//		
		
//		//for each loop
//		for(Object hs1:hs)
//		{
//			System.out.println(hs1.ge);
//		}
		
		
		System.out.println("=========");
		//universal iterator method
		Iterator hsi = hs.iterator();
		while(hsi.hasNext())
		{
			System.out.println(hsi.next());
		}
		
		
	}

}
