package Interface_Study;

public class University implements eductation2 {
      
	int a = 100;
	int b = 200;
	int c = 300;
	int d = 400;
	final int i =1000;
	final int z =1500;
	
	
	
	public static void main(String[] args) 
	{
       University uv = new University();
       uv.school();
       uv.clg();
       uv.engg();
       uv.phd();
       
	}

	@Override
	public void school() 
	{
		int A = a+b+i+5000;
		System.out.println("fees of school is "+A);
		
	}

	@Override
	public void clg() 
	{   
		int S = i+10000;
		int B = b+c+i+10000;
		System.out.println("fees of clg is "+B);
	}

	@Override
	public void engg() 
	{
	  int C = c+d+z+15000;
	  System.out.println("fees of engg is "+C);
	}

	@Override
	public void phd() 
	{
		int D = a+d+z+25000;
	  System.out.println("fees of phd is "+D);	
	}

}
