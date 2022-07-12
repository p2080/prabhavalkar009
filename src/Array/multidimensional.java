package Array;

public class multidimensional {
	
public static void main(String[] args) 
{
	String a[][]= {{ "kolhpaur","corporation","rajrampuri"},{ "pune","corporation","swarget"},{"mumbai","corporation","dader"},{"dehi","corporation","guwati"}}; 
	
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

}

}
