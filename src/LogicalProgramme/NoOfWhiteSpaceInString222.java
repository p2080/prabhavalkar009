package LogicalProgramme;

public class NoOfWhiteSpaceInString222 {

	public static void main(String[] args)
	{
		String a = "p   r a   s a   n n  a";
		int count = 0;
		for(int i=0;i<=a.length()-1;i++)
		{
			char mychar= a.charAt(i);
				if(mychar==' ')	
				{
					count++;
				}
		}
		System.out.println("number of whitespace in string "+a+" is="+count);
		
		
		

	}

}
