package string;

public class Equals {

	public static void main(String[] args) 
	{
      String p1 = "Prabhavalkar";
      String p2 = "prabhavalkar";
      String p3 = "Prabhavalkar";
      String p4 = "PrabhavalkaR";
      String p5 = new String("Prabhavalkar");
      String p6 = new String("prabhavalkar");
      String p7 = new String("Prabhavalkar");
      String p8 = new String("PrabhavalkaR");
      String p9 = new String("Prabhavalka");
      System.out.println(p1==p2);
      System.out.println(p1==p3);
      System.out.println(p3==p4);
      System.out.println(p1==p5);
      System.out.println(p3==p7);
      System.out.println(p5==p7);
      System.out.println(p5==p8);
      
      System.out.println("========================");
      
      System.out.println(p5.equals(p7));
      System.out.println(p6.equals(p2));
      System.out.println(p4.equals(p8));
      System.out.println(p4.equals(p6));
      System.out.println(p2.equals(p8));
      
      System.out.println("========================");
      
      System.out.println(p4.equalsIgnoreCase(p2));
      System.out.println(p2.equalsIgnoreCase(p9));//check spelling due to you understand
      System.out.println(p8.equalsIgnoreCase(p7));
      
	}

}
