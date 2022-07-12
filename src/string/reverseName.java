package string;

public class reverseName {

	public static void main(String[] args) 
	{
       String a = "123456789";
       
       String A = " ";
       
       for(int i=a.length()-1;i>=0;i--)
    	   
       {
    	   A = A+a.charAt(i);
       }
       System.out.println(A+" ");
	
	}
	

}
