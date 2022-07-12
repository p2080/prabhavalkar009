package casting;

public class suk_kolhapur extends bcom 
{

	public static void main(String[] args) 
	{
      
		enggnering ee = new enggnering();
		ee.present();
		ee.fees();
		ee.marks();
		
		System.out.println("=====================================");
		
		enggnering ee1 = new bsc();
		ee1.present();
		ee1.fees();
		ee1.marks();
		
		System.out.println("======================================");
		enggnering ee2 = new bcom();
		ee2.present();
		ee2.fees();
		ee2.marks();
	}

}
