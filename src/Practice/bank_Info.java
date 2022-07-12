package Practice;

public class bank_Info {

	//bank name , customer name, loan no, pending amount, customer grade
	
	String Bank_Name;
	String Customer_name;
	int Loan_no;
	float Pending_Amount;
	char Customer_Grade;
	
	public void Customer_info()
	{
		System.out.println("===========================================");
		System.out.println("Name of the bank is "+Bank_Name);
		System.out.println("Name of the customer is "+Customer_name);
		System.out.println("Customer loan no is "+Loan_no);
		System.out.println("Customer pending amount is "+Pending_Amount);
		System.out.println("Customer grade in bank is "+Customer_Grade);
		System.out.println("===========================================");
	}
	
	public static void main(String[] args) 
	{
		bank_Info Bank = new bank_Info();
		Bank.Bank_Name = "HDFC";
		Bank.Customer_name = "Prabhavalkar";
		Bank.Loan_no = 1420;
		Bank.Pending_Amount = 1050000.50f;
		Bank.Customer_Grade = 'A';
		
		Bank.Customer_info();
		
	
	
	
	}

}
