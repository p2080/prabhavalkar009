package Genralization;

public class TestGenralization {

	public static void main(String[] args)
	{
     Jio j = new Jio();
     System.out.println("==========Jio=========");
     j.call();
     j.data();
     j.msg();
     j.new_method_jio();
     System.out.println("==========Jio=========");
     
     
     Airtel a = new Airtel();
     System.out.println("==========Airtel=========");
     a.call();
     a.data();
     a.msg();
     a.new_method_airtel();
     System.out.println("==========Airtel=========");
     
     Vi v = new Vi();
     System.out.println("==========Vi=========");
     v.call();
     v.data();
     v.msg();
     v.new_method_vi();
     System.out.println("==========Vi=========");
     
     idea i = new idea();
     System.out.println("==========idea=========");
     i.call();
     i.data();
     i.msg();
     i.new_method_idea();
     
	}

}
