package Interface_Study;

public class india_gov implements up_gov
{

	public static void main(String[] args) 
	{
       india_gov ig = new india_gov();
       ig.gst();
       ig.cgst();
      
       System.out.println("====================");
       ig.gst1();
       ig.cgst2();
       
       System.out.println("====================");
       ig.tax();
       System.out.println("====================");
	}

	@Override
	public void gst() 
	{
		System.out.println("mahrastra gov gst 9%");
	}

	@Override
	public void gst1() 
	{
		System.out.println("up gov gst 9%");
	}

	@Override
	public void cgst() 
	{
		System.out.println("mahrastra gov cgst 9%");
	}

	@Override
	public void cgst2() 
	{
		System.out.println("up gov cgst 9%");
	}
    
	public void tax()
	{
		System.out.println("gst 9%");
		System.out.println("cgst 9%");
	}
}
