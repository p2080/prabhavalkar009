package Practice;

public class Array3 {

	public static void main(String[] args) 
	{
      int a[] = {1,2,3,4};
      int b[] = {4,5,6,7};
	  
     int sum= 0;
	 for(int i=0;i<=a.length-1;++i)
	 {
		 for(int j=0;j<=b.length;++j)
		 {
			sum =++i;
			sum =++j;
			sum =(++i)+(++j);
		 }
		 System.out.println(sum+" ");
	 }
	}

}
