package constructor;

public class UserDefineParameter {
	
	int a,b,sum,mul,sub;
	
	public UserDefineParameter()
	{
		a=10;
		b=20;
	}
	
	public  UserDefineParameter(int x, int y)
	{
		a=x;
		b=y;
	}
	
    public void calculation()
    
	 {
		sum=a+b;
		System.out.println("sum is "+sum);
		mul=a*b;
		System.out.println("multiplication is "+mul);
		sub=a-b;
		System.out.println("substraction is "+sub);

	}
    
	 public static void main(String[] args) {
		 UserDefineParameter dd = new UserDefineParameter();
		 dd.calculation();
		 System.out.println("===========");
		 UserDefineParameter dd1  = new UserDefineParameter(100,200);
		 dd1.calculation();
		 
		 
		 
	 }
	 
	 
	 
}
