package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import string.contains;

public class ArrayListUse {

	public static void main(String[] args)
	{
		ArrayList a = new ArrayList<>();
 		
		a.add("prasanna");
		a.add(12345);
		a.add('A');
		a.add(null);
		a.add(25.25);
		a.add("prasanna");
		a.add('B');
		a.add(50.500);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.indexOf(50.500));
		System.out.println(a.isEmpty());
		System.out.println(a.contains("prasanna"));
		System.out.println(a.get(4));
		a.set(1, 888888);//update
		System.out.println(a.get(1));
		a.remove(2);//left shift-->when you try to remove/delete from in between of arraylist
		System.out.println(a);
		a.add(2, "prabhavalkar");//right shift--> when we are inserting element in between arrylist
		System.out.println(a);
		
		System.out.println("==========");
		for(int i=0;i<=a.size()-1;i++) //for loop method
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("=========");
		for(Object a1:a) //for each method 
		{
			System.out.println(a1);
		}
		
		System.out.println("=========");
		Iterator a2 = a.iterator();  // iterator method
		while(a2.hasNext())
		{
			System.out.println(a2.next());
		}
		
		
		System.out.println("=========");
		ListIterator a3 = a.listIterator();// listiterator method
		while(a3.hasNext())
		{
			System.out.println(a3.next());
		}
		
		
			
		}

	}


