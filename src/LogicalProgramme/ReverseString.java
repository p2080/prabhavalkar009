package LogicalProgramme;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		
		String a = sc.next();
		String b ="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
        System.out.println("orginal string is "+a);
        System.out.println("reverse string is "+b);
	}

}
