package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashlist_interger {

	public static void main(String[] args) 
	{
        //specific method
		LinkedHashSet< Integer> lhsi = new LinkedHashSet<Integer>();
		lhsi.add(200);
		lhsi.add(300);
		lhsi.add(400);
		lhsi.add(500);
		lhsi.add(200);
		lhsi.add(100);
		lhsi.add(400);
		
		//here duplicate are not allowed
		System.out.println(lhsi);
		System.out.println(lhsi.size());
		System.out.println(lhsi.contains(100));
		System.out.println(lhsi.contains(50));
		
		
		System.out.println("==========");
		//for each loop
		for(Object lhsi1:lhsi)
		{
			System.out.println(lhsi1);
		}
		
		
		System.out.println("==========");
		//for loop
		for(int i=0;i<=lhsi.size()-1;i++)
		{
			System.out.println(lhsi);
		}
		
		
		System.out.println("==========");
		//universal-iterator method
		Iterator<Integer> lhsi2 = lhsi.iterator();
		while(lhsi2.hasNext())
		{
			System.out.println(lhsi2.next());
		}
			
		
		
	}

}
