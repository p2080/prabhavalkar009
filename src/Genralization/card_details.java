package Genralization;

public class card_details {

	public static void main(String[] args) 
	{
       sbi s = new sbi();
       System.out.println("============sbi============");
       s.type_of_card();
       s.credit_limit();
       s.annual_fee();
       s.statment_genrate_date();
       s.type_of_card();
       System.out.println("============sbi============");
       
       
       
       hdfc h = new hdfc();
       System.out.println("============hdfc===========");
       h.type_of_card();
       h.annual_fee();
       h.credit_limit();
       h.statment_genrate_date();
       h.type_of_card();
       System.out.println("============hdfc===========");
       
       axis a = new axis();
       System.out.println("============axis===========");
       a.type_of_card();
       a.credit_limit();
       a.annual_fee();
       a.statment_genrate_date();
       System.out.println("============axis===========");
	}

}
