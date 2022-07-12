package LogicalProgramme;

public class NoOfWhiteSpaceInString {

	public static void main(String[] args) 
	{
		String a="P  u n  e ";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char myChar = a.charAt(i);
			if(myChar==' ')
			{
				count++;
			}
		}
		System.out.println("number of white space in "+a+"is"+count);
		

	}

}
