package LogicalProgramme;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args)
	{
		//num/2remaining-->0-->even
		//System.out.println(10%2);//0
		//System.out.println(10/2);//5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        int a = sc.nextInt();
        if(a%2==0)
        {
        	System.out.println("given number is even number");
        }
        else
        {
        	System.out.println("given number is odd number");
        }
		
		
	}

}
