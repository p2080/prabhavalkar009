package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import Abstract_class.newabstract2;

public class linked_list_study {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
        
		ll.add("velocity");
		ll.add(300);
		ll.add(null);
		ll.add(15.15);
		ll.add("velocity");
		ll.add(null);
		ll.add(true);
		ll.add(250);
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	    System.out.println(ll.peek());//select first
	    System.out.println(ll);
	    System.out.println(ll.poll());//
	    System.out.println(ll);
	    System.out.println(ll.poll());
	    System.out.println(ll.pop());
	    System.out.println(ll);

	    
	    //for loop
	    //for each
	    //iterator
	    //list-iterator
	    
	    System.out.println("============");
	    //for loop
	    for(int i=0;i<=ll.size()-1;i++)
	    {
	    	System.out.println(ll.get(i));
	    }
	    System.out.println("============");
	    
	    //for each
	    for(Object ll1:ll)
	    {
	    	System.out.println(ll1);
	    }
	    System.out.println("============");
	    
	    
	    //iterator
	    Iterator lli = ll.iterator();
	    while(lli.hasNext())
	    {
	    	System.out.println(lli.next());
	    }
	    System.out.println("============");
	    
	    
	    //list-iterator
	    ListIterator lli1 = ll.listIterator();
	    while(lli1.hasNext())
	    {
	    	System.out.println(lli1.next());
	    }
	
	}

}
