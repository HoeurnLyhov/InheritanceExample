package pack1;

public class ChildSamePack1 extends BaseClass 
{
	int a,b;
	public int add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) 
	{
		ChildSamePack1 csp=new ChildSamePack1();
		csp.add(200,300);
		

	}

}
