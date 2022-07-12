package LogicalProgramme;

import java.util.Scanner;

public class Palndrome222 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr name");
		String a = sc.next();
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		if(a.equals(b))
		{
			System.out.println("string is palendrom ");
		}
		else
		{
			System.out.println("string is not palendrome");
			
		}
		

	}

}
