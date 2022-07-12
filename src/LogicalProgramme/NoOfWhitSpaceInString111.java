package LogicalProgramme;

public class NoOfWhitSpaceInString111 {

	public static void main(String[] args) 
	{
		String a ="p p    p  pp ";
		int count =0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char myChar=a.charAt(i);
			if(myChar==' ')
			{
				count++;
			}
		}
		
		System.out.println("number of white space in string"+a+"is"+count);
		
		

	}

}
