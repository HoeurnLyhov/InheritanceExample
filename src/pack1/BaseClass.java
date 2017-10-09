package pack1;

public class BaseClass 
{
	public String pubVar;
	protected String proVar;
	private String priVar;
	String defVar;
	
	public void localFunction()
	{
		System.out.println(pubVar);
		System.out.println(proVar);
		System.out.println(priVar);
		System.out.println(defVar);
	}
	
	
}
