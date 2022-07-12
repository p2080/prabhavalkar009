package Pattern;

public class Eg5 {

	public static void main(String[] args)
	{
//		       *
//		      **
//           ***
//          ****
//         ***** 
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=space;i++)
			{
				System.out.print(" ");
			}
		    for(int j=1;j<=star;j++)
		    {
		    	System.out.print("* ");
		    }
		    System.out.println();
		    star++;
		    space--;
		    
		}
	}

}
