package LogicalProgramme;

import java.util.Arrays;

public class CompareArray111 {

	public static void main(String[] args) 
	{
		int [] a = {10,20,30};
		int [] b = {100,200,300};
		int [] c = {10,20,30};
		int [] d = {100,200,300};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(d,c));
		System.out.println(Arrays.equals(d,b));
		
		
	}

}
