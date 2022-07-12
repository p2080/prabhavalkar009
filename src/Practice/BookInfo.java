package Practice;

public class BookInfo {

	public static void main(String[] args) {
		BookInfo BI =new BookInfo();
		BI.Bookinfo("Rich dad poor dad ","Robart kiyoski", 1600.60, 150, 'B');
		BI.Bookinfo("Janta raja ", "Babasaheb purander", 1550.50, 450, 'A');

	}
	public void Bookinfo(String Name,String Writer,double Price,int Pages,char Catlog)
	
	{
		
     System.out.println("===========================");
     System.out.println("Book name is "+Name);
     System.out.println("Author name is "+Writer);
     System.out.println("Price of book is "+Price);
     System.out.println("Pages in book is "+Pages);
     System.out.println("Catalog Series is "+Catlog);
     System.out.println("===========================");
     
	}

}
