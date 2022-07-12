package Pattern;

public class Eg12 {

	public static void main(String[] args) 
	{
//		*
//		**
//		***
//		****
//		*****
//		******
//		*****
//		****
//		***
//		**
//		*
//		row=11; star=1; space=0;
		int star=1;
		for(int i=1; i<=11; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				star++;  //for increasing star
			}
			else
			{
				star--;  //for decreasing star
			}
		}

	}

}
