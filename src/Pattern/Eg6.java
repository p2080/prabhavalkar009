package Pattern;

public class Eg6 {

	public static void main(String[] args) 
	{   
		int Orgnum = 123;
		String orgString = Integer.toString(Orgnum);
		String revString = "";
		for(int i=orgString.length()-1;i>=0;i--)
		{
			revString=revString+orgString.charAt(i);
		}		
		int revNum =Integer.parseInt(revString);
		System.out.println("original number is "+Orgnum);
        System.out.println("Reverse number is "+revNum);
		
		
		

	}

}
