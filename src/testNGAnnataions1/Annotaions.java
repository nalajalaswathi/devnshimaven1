package testNGAnnataions1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions 
{

	@Test(priority=1)
	public void method1()
	{
		System.out.println("method1 executed");
	}
	
	@Test(priority=0)
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("before method executed");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("after method executed");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("before class executed");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("after class executed");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("before test executed");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("after test executed");
	}
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("before suit executed");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("after suit executed");
	}
	
}
