package string;

public class stringStudy1 {

	public static void main(String[] args) 
	{
     String name = "velocity";//with-out using new keyword
     String city = new String("pune");//with using new keyword
     
     //length() method use
     System.out.println(name.length());
     System.out.println(city.length());
     
     int output = name.length();//storing output in reference variable 
     System.out.println("length of storing is "+output);
     
     System.out.println("============================");
     
     //touppercase() method use
     String a = "velocity";
     
     System.out.println(a);
     System.out.println(a.toUpperCase());
     
     String b = a.toUpperCase();
     System.out.println(b);
     System.out.println(b.toLowerCase());
     
     String c = b.toLowerCase();
     System.out.println(c);
     System.out.println("================================");
     
     //4.equals() method study   //equals are in boolean // here we compare where are stored 
     String a1 = "Velocity";//they are stored in constant pool area but variables are same 
     String a2 = "Velocity";//they are stored in constant pool area but variables are same 
     String a3 = "velocity";//they stored in constant pool area but variable are diff
     String a4 = new String("Velocity");//they are stored in non constant pool area that's why there location are diff 
     String a5 = new String("Velocity");//they are stored in non constant pool area that's why there location are diff
     String a6 = new String("velocity");//they are stored in non constant pool area that's why there location are diff
     //== will compare memory location that will not compare string content
     System.out.println(a1==a2);
     System.out.println(a1==a3);
     System.out.println(a3==a4);
     System.out.println(a4==a5);
     System.out.println(a2==a1);
     
     //equals are compare content of string  //here we are compare content 
     System.out.println("==================================");
     System.out.println(a1.equals(a2));//Velocity==Velocity
     System.out.println(a1.equals(a3));//Velocity==velocity
     System.out.println(a1.equals(a4));//Velocity==Velocity
     System.out.println(a3.equals(a2));//velocity==Velocity
     System.out.println(a1.equals(a6));//Velocity==velocity
     System.out.println(a3.equals(a6));//velocity==velocity
     System.out.println("===================================");
     
     System.out.println(a1.equals(a5));
     System.out.println(a1.equalsIgnoreCase(a5));
     System.out.println(a3.equalsIgnoreCase(a4));//velocity==Velocity
     
     System.out.println("===================================");
     
     //contains()method use
     String b1="Velocity";
     System.out.println(b1.contains("lo"));
     boolean result = b1.contains("lo");
     System.out.println("result is "+result);  
     System.out.println(b1.contains("city"));//city word are present in velocity word that's why the condition is true
     System.out.println(b1.contains("V"));
     System.out.println(b1.contains("Vc"));//Vc are word's are present in velocity word but they are not in sequance as per velocity word
     System.out.println(b1.contains("vel"));// v are not upper case because we are use of velocity word in that word v is upper case
     System.out.println("========================================");
     
     
     //isEmpty method use
     String m = "Pune";
     String n = "";
     String l = " ";
     String o = null;
     
     // System.out.println(o.length); //NullpointerException are present
     System.out.println(m.length());
     System.out.println(n.length()); 
     System.out.println(l.length());
    // System.out.println(o.length());-->>NullpointerException are present
     
     System.out.println(m.isEmpty());
     System.out.println(n.isEmpty());
     System.out.println(l.isEmpty());
     System.out.println("================================");
     
     System.out.println(m.isBlank());
     System.out.println(n.isBlank());
     System.out.println(l.isBlank());
    // System.out.println(o.isBlank());-->>-->>NullpointerException are present
     
     System.out.println("=================================");
     
     //charAt method use
     String p="INDIA";
     
     System.out.println(p.charAt(3));
     System.out.println(p.charAt(0));
     char requiredchar = p.charAt(1);
     System.out.println(requiredchar);
     //System.out.println(p.charAt(-1));-->>StringIndexOutOfBoundsException
     //System.out.println(p.charAt(9));-->>StringIndexOutOfBoundsException
     System.out.println("=================================");
     
     //endsWith method use
     
     String e = "Velocity";
     System.out.println(e.endsWith("ty"));
     System.out.println(e.endsWith("yt"));
     System.out.println(e.endsWith("city"));
     System.out.println(e.endsWith("vel"));
     System.out.println(e.endsWith("Vel"));
     System.out.println("=================================");
     
     
     //startWith method use 
     
     System.out.println(e.startsWith("Ve"));
     System.out.println(e.startsWith("loc"));
     System.out.println(e.startsWith("city", 4));// e.startsWith(e, requiredchar)  used here
     System.out.println(e.startsWith("ocity", 3));
     System.out.println("=================================");
     
     //substring method use
     
     String test = "velocity corporate training center";
     System.out.println(test.substring(7));
     System.out.println(test.substring(10));
     String myString= test.substring(9);
     System.out.println(myString);
     
     System.out.println(test.substring(8,20));
     System.out.println(test.substring(2, 5));
     
     
     
     //split method use
     
     String mystring = "good morning";
     String s = "";
     String hello[]= mystring.split(s);
     System.out.println(hello[5]);
     
     System.out.println("=================================");
     //concat
     String firstname = "john";
     String lastname = "doe";
      
     System.out.println(firstname.concat(lastname)+" ");
     }

}









