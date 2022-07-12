package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_study {

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		
		ts.add(200);
		//ts.add("pune");   //java.lang.ClassCastException 
		ts.add(300);
		ts.add(400);
		ts.add(700);
		ts.add(500);
		ts.add(600);
		ts.add(500);
		ts.add(400);
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println(ts.contains(700));
		System.out.println(ts.contains(1000));
		
		System.out.println("============");
		//for loop
		for(int i=0;i<=ts.size()-1;i++)
		{
			System.out.println(ts);
		}
		
		
		System.out.println("============");
		//for each loop
		for(Object ts1:ts)
		{
			System.out.println(ts1);
		}
		
		
		System.out.println("============");
		//uneversal-iterator method
		Iterator ts2 = ts.iterator();
		while(ts2.hasNext())
		{
			System.out.println(ts2.next());
		}
		
		

	}

}
