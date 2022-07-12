package Interface_Study;

public class child implements Father,Mother {

	public static void main(String[] args) 
	{
     child c = new child();
     c.money();
     c.property();
     c.look();
     c.reciepe();
	}

	@Override
	public void look()
	{
		System.out.println("look method completed by child");
	}

	@Override
	public void reciepe() 
	{
		System.out.println("reciepe method completed by child");
	}

	@Override
	public void money() 
	{
		System.out.println("money method completed by child");
	}

	@Override
	public void property() 
	{
		System.out.println("property method completed by child");
	}

}
