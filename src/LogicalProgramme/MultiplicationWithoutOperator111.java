package LogicalProgramme;

import java.util.Scanner;

public class MultiplicationWithoutOperator111 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		int a = sc.nextInt();
		
		System.out.println("enter value of b");
		int b = sc.nextInt();
		
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+a;
		}
		System.out.println("mulitpication is "+sum);
		
		
		

	}

}
