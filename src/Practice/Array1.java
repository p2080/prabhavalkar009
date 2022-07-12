package Practice;

public class Array1 
{
public static void main(String[] args)
{
	int a[][] = {{20*20,10*10,15*15},{10+10,10+390,10-5},{10*10,300/10,500-50}};
	
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[i][j]+" ");
		}
	}
}
}
