package Array;

public class multidimensionalArray {

	public static void main(String[] args) 
	{
		int a[][]=new int [2][2];
		
		//array assign value
		a[0][0]=1;                    //row-->      0   1  //first we declare row
		a[0][1]=2;					  //
		a[1][0]=3;					  //  		    2   3
		a[1][1]=4;                    //            ^
									  //		    ^
									  //           column
		//susage 
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println("=========");
		
		//usage using for loop
		
		for (int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" "); //you give "ln" is next line
			}
			System.out.println(" ");
		}
		
		
		
	}

}
