package mar2nd;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinHomePage {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started...");
		System.out.println("App Launched...");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ...");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		Assert.assertTrue(false);
		System.out.println("Login successfull..");
		
	}
	
	@Test(priority=1)
	public void registerTest()
	{
		
		System.out.println("Registration successfull..");
		
		
	}
	
	@Test(priority=3)
	public void forgotPasswordTest()
	{
		System.out.println("ForgotPassword successfull..");
	}
	
	@Test(priority=4,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("ChangePassword successfull..");
	}

}
