package LogicalProgramme;

public class ReverseTheNumberByConvert {

	public static void main(String[] args)
	{
		int orgnum =123;
	
		String orgString = Integer.toString(orgnum);
		String revString="";
		for(int i=orgString.length()-1;i>=0;i--)
		{
			revString=revString+orgString.charAt(i);
		}
		int revNum=Integer.parseInt(revString);
		System.out.println("original number is "+orgnum);
		System.out.println("revrse number is "+revNum);

	}

}
