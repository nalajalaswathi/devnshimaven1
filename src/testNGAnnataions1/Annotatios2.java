package testNGAnnataions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotatios2 
{
	WebDriver driver;
    
	  @BeforeMethod
	  public void LoginHRM()
	  {
		driver=new FirefoxDriver();		  				  
	    driver.get("http://testingmasters.com/hrm/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("txtUsername")).sendKeys("user01");
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	  }
	
	@Test
	public void ApplyAnnualLeave()
	{
		System.out.println("Annual Leave Applied Succsessfully");
	}
	
	@AfterMethod
	public void LogoutHRM()
	{
		driver.close();
	}
	
}
