package ExtraProgramme;

public class Palindrome_Reverse_StringProgrramme {

	public static void main(String[] args)
	{
		String a = "NAYAN";
		String A = "";//at Palindrome programme here not allowed space
		
		for(int i=a.length()-1;i>=0;i--)
		{
			A=A+a.charAt(i);
		}
		System.out.println(A);
		//to check whether the string is palindrome or not
		if(a.equals(A))
		{
			System.out.println("given string is Palindrome "+A);
		}
		else
		{
			System.out.println("Given String is not PalinDrome "+A);
		}

	}

}
