package string;

public class isEmpty_isBlank {

	public static void main(String[] args)
	{
       String a1 = "prasanna";
       String a2 = "  ";
       String a3 = "";
       String a4 = " p ";
       String a5 = null;
       
       System.out.println(a1.length());
       System.out.println(a2.length());
       System.out.println(a3.length());
       System.out.println(a4.length());
       //System.out.println(a5.length());
       
       System.out.println("==============");
       
       System.out.println(a1.isEmpty());
       System.out.println(a2.isEmpty());
       System.out.println(a3.isEmpty());
       System.out.println(a4.isEmpty());
       
       System.out.println("==============");
       
       System.out.println(a1.isBlank());
       System.out.println(a2.isBlank());
       System.out.println(a3.isBlank());
       System.out.println(a4.isBlank());
       System.out.println("==============");
       
	}

}
