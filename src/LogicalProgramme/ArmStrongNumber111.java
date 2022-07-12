package LogicalProgramme;

public class ArmStrongNumber111 {

	public static void main(String[] args)
	{
		int num = 370;
		int num1 = 0;
		for(int i=num;i>=0;i=i/10)
		{
			int rem = i%10;
			   num1 = num1+rem*rem*rem;
		}
		if(num==num1)
		{
			System.out.println("given number"+num+" is armstrong");
		}
		else
		{
			System.out.println("given number "+num+"is not armstrong");
			
		}
		
		

	}

}
