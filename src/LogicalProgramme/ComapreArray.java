package LogicalProgramme;

import java.util.Arrays;

public class ComapreArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4};
		int [] b = {10,20,30,40};
		int [] c = {1,2,3,4};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));

	}

}
