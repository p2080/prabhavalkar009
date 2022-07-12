package Polymorphism;

public class schoolCollegeOverLoading extends collage
{

	public static void main(String[] args)
	{
      schoolCollegeOverLoading sc = new schoolCollegeOverLoading();
      sc.fees();// calling class of school 
      sc.fees(50000,100000, 150000);
	}

}
