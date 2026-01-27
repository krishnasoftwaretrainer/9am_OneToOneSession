package testNG;

import org.testng.annotations.Test;

public class SampleTetsNGScripts
{
	@Test(priority=1)
	public void India()
	{
		System.out.println("This is India Method");
	}
	
	@Test(priority=2,invocationCount=3)
	public void Telangana()
	{
		System.out.println("This is Telangana Method");
	}
	
	@Test(priority=3)
	public void Hyderabad()
	{
		System.out.println("This is Hyderabad Method");
	}

}
