package Abstract_class;

public class icc extends bcci
{
 public static void main(String[] args) 
 {
	icc i = new icc();
	i.income();
	i.deb();
 }
  public void deb()
  {
	  int a = 10000;
	  int b = 12500;
	  int sum = a+b;
	  System.out.println("total of debit is= "+sum);
  }
 
}
