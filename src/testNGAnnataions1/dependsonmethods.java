package testNGAnnataions1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods 
{

	@Test
	public void login()
	{
		System.out.println("login successfully");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"login","logout"})
	public void Inbox()
	{
		System.out.println("inbox  page is opened");
	}
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		System.out.println("logout successfully ");
	}
}
