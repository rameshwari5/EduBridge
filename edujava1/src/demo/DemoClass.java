package demo;

public class DemoClass {

	public static void main(String[] args) {
		
		try {
		new DemoClass().demoM();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void demoM() throws Exception
	{
		throw new Exception("demo");
	}
}
