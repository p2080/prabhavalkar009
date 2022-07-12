package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arreyList_specific_dt {

	public static void main(String[] args) 
	{
        ArrayList<Integer>a3 = new ArrayList<>();
        
        a3.add(15);
        a3.add(25);
        a3.add(250);
        a3.add(2525);
        a3.add(85);
        a3.add(45);
        
        System.out.println(a3);
        System.out.println(a3.size());
        System.out.println(a3.indexOf(25));
        System.out.println(a3.get(3));
        System.out.println(a3.isEmpty());
        System.out.println(a3.remove(4));
        System.out.println(a3.lastIndexOf(2525));
        System.out.println(a3);
        System.out.println(a3.size());
        System.out.println(a3.lastIndexOf(250));
        
        
        System.out.println("==============");
        for(int i=0;i<=a3.size()-1;i++) 
        {
        	System.out.println(a3.get(i));
        }
        
        
        System.out.println("==============");
        Iterator<Integer> aa = a3.iterator();
        while(aa.hasNext()) //universal iterator method
        {
        	System.out.println(aa.next());
        }
       
        
        System.out.println("==============");
        ListIterator<Integer> aaa = a3.listIterator();
        while(aaa.hasNext())  //list-iterator method
        {
    	   System.out.println(aaa.next());
        }
        
        
        System.out.println("==============");
        for(Integer a5:a3)  //for each loop
        {
        	System.out.println(a5);
        }
        
        
	}
}
