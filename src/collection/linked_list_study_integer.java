package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linked_list_study_integer {

	public static void main(String[] args)
	{
		LinkedList<Integer> li = new LinkedList<Integer>();//specific type
		
		li.add(25);
		li.add(35);
		li.add(50);
		li.add(25);
		li.add(45);
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.indexOf(50));
		System.out.println(li.remove(4));
		System.out.println(li);
		System.out.println(li.contains(2));
		System.out.println(li.contains(50));
		System.out.println(li.pop());
//		System.out.println(li.poll());
//		System.out.println(li.poll());
		
		
		System.out.println("================");
		//for loop
		for(int i=0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("================");
		//for each
		for(Integer a1:li)
		{
			System.out.println(a1);
		}
		
		
		System.out.println("================");
		//universal interator method
		Iterator<Integer> li1 = li.iterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		
		System.out.println("================");
		//list-iterator method
		ListIterator<Integer> li2 = li.listIterator();
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		
		
	}

}
