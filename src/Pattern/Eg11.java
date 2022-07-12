package Pattern;

public class Eg11 {

	public static void main(String[] args) 
	{
		
//		******
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
//		******

		
//		row=11; star=6; space=0;
		int star = 6;
		for(int i=1; i<=11; i++)
		{
			for(int j=1; j<=star; j++)
			{
			System.out.print("*");
			}
			System.out.println();
			if(i<6)
			{
				star--;
			}
			else
			{
				star++;
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
